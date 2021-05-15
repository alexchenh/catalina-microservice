package com.chenh.catalina.pms.controller;

import com.chenh.catalina.pms.dto.ProductCategoryParam;
import com.chenh.catalina.pms.dto.ProductCategoryWithChildrenItem;
import com.chenh.catalina.pms.service.ProductCategoryService;
import com.chenh.common.core.api.CommonPage;
import com.chenh.common.core.api.CommonResult;
import com.chenh.common.mybatis.model.PmsProductCategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品分类管理Controller
 * @author chenh
 * @date 2021年04月22日
 */
@RestController
@Api(tags = "商品分类管理")
@RequestMapping("/productCategory")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;

    @ApiOperation("添加产品分类")
    @PostMapping("/create")
    public CommonResult create(@Validated @RequestBody ProductCategoryParam productCategoryParam) {
        int count = productCategoryService.create(productCategoryParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("修改商品分类")
    @PostMapping("/update/{id}")
    public CommonResult update(@PathVariable Long id,
                               @Validated
                               @RequestBody ProductCategoryParam productCategoryParam) {
        int count = productCategoryService.update(id, productCategoryParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("分页查询商品分类")
    @GetMapping("/list/{parentId}")
    public CommonResult<CommonPage<PmsProductCategory>> getList(@PathVariable Long parentId,
                                                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<PmsProductCategory> productCategoryList = productCategoryService.getList(parentId, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(productCategoryList));
    }

    @ApiOperation("根据id获取商品分类")
    @GetMapping(value = "/{id}")
    public CommonResult<PmsProductCategory> getItem(@PathVariable Long id) {
        PmsProductCategory productCategory = productCategoryService.getItem(id);
        return CommonResult.success(productCategory);
    }

    @ApiOperation("查询所有一级分类及子分类")
    @GetMapping("/list/withChildren")
    public CommonResult<List<ProductCategoryWithChildrenItem>> listWithChildren() {
        List<ProductCategoryWithChildrenItem> list = productCategoryService.listWithChildren();
        return CommonResult.success(list);
    }

    @ApiOperation("删除商品分类")
    @PostMapping("/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        int count = productCategoryService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("修改导航栏显示状态")
    @PostMapping("/update/navStatus")
    public CommonResult updateNavStatus(@RequestParam("ids") List<Long> ids, @RequestParam("navStatus") Integer navStatus) {
        int count = productCategoryService.updateNavStatus(ids, navStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("修改显示状态")
    @PostMapping("/update/showStatus")
    public CommonResult updateShowStatus(@RequestParam("ids") List<Long> ids, @RequestParam("showStatus") Integer showStatus) {
        int count = productCategoryService.updateShowStatus(ids, showStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }
}
