package com.chenh.catalina.pms.controller;

import com.chenh.catalina.pms.dto.ProductAttributeCategoryItem;
import com.chenh.catalina.pms.service.ProductAttributeCategoryService;
import com.chenh.common.core.api.CommonPage;
import com.chenh.common.core.api.CommonResult;
import com.chenh.common.mybatis.model.PmsProductAttributeCategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品属性分类管理Controller
 * @author chenh
 * @date 2021年04月22日
 */
@RestController
@Api(tags = "商品属性分类管理")
@RequestMapping("/productAttribute/category")
public class ProductAttributeCategoryController {
    @Autowired
    private ProductAttributeCategoryService productAttributeCategoryService;

    @ApiOperation("添加商品属性分类")
    @PostMapping("/create")
    public CommonResult create(@RequestParam String name) {
        int count = productAttributeCategoryService.create(name);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("修改商品属性分类")
    @PostMapping("/update/{id}")
    public CommonResult update(@PathVariable Long id, @RequestParam String name) {
        int count = productAttributeCategoryService.update(id, name);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除单个商品属性分类")
    @GetMapping("/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        int count = productAttributeCategoryService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("获取单个商品属性分类信息")
    @GetMapping("/{id}")
    public CommonResult<PmsProductAttributeCategory> getItem(@PathVariable Long id) {
        PmsProductAttributeCategory productAttributeCategory = productAttributeCategoryService.getItem(id);
        return CommonResult.success(productAttributeCategory);
    }

    @ApiOperation("分页获取所有商品属性分类")
    @GetMapping("/list")
    public CommonResult<CommonPage<PmsProductAttributeCategory>> getList(@RequestParam(defaultValue = "5") Integer pageSize, @RequestParam(defaultValue = "1") Integer pageNum) {
        List<PmsProductAttributeCategory> productAttributeCategoryList = productAttributeCategoryService.getList(pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(productAttributeCategoryList));
    }

    @ApiOperation("获取所有商品属性分类及其下属性")
    @GetMapping("/list/withAttr")
    public CommonResult<List<ProductAttributeCategoryItem>> getListWithAttr() {
        List<ProductAttributeCategoryItem> productAttributeCategoryResultList = productAttributeCategoryService.getListWithAttr();
        return CommonResult.success(productAttributeCategoryResultList);
    }
}
