package com.chenh.catalina.pms.controller;

import com.chenh.catalina.pms.domain.ProductCategoryNode;
import com.chenh.catalina.pms.dto.ProductDetail;
import com.chenh.catalina.pms.dto.ProductParam;
import com.chenh.catalina.pms.dto.ProductQueryParam;
import com.chenh.catalina.pms.dto.ProductResult;
import com.chenh.catalina.pms.service.SpuService;
import com.chenh.common.core.api.CommonPage;
import com.chenh.common.core.api.CommonResult;
import com.chenh.common.mybatis.model.PmsProduct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品管理Controller
 * @author chenh
 * @date 2021年04月22日
 */
@RestController
@Api(tags = "商品管理")
@RequestMapping("/product")
public class SpuController {
    @Autowired
    private SpuService spuService;

    @ApiOperation("创建商品")
    @PostMapping("/create")
    public CommonResult create(@RequestBody ProductParam productParam) {
        int count = spuService.create(productParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("查询商品")
    @GetMapping("/list")
    public CommonResult<CommonPage<PmsProduct>> getList(ProductQueryParam productQueryParam,
                                                        @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<PmsProduct> productList = spuService.list(productQueryParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(productList));
    }

    @ApiOperation("更新商品")
    @PostMapping("/update/{id}")
    public CommonResult update(@PathVariable Long id, @RequestBody ProductParam productParam) {
        int count = spuService.update(id, productParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据商品id获取商品编辑信息")
    @GetMapping("/updateInfo/{id}")
    public CommonResult<ProductResult> getUpdateInfo(@PathVariable Long id) {
        ProductResult productResult = spuService.getUpdateInfo(id);
        return CommonResult.success(productResult);
    }

    @ApiOperation("根据商品名称或货号模糊查询")
    @GetMapping("/simpleList")
    public CommonResult<List<PmsProduct>> getList(String keyword) {
        List<PmsProduct> productList = spuService.list(keyword);
        return CommonResult.success(productList);
    }

    @ApiOperation("批量上下架")
    @PostMapping("/update/publishStatus")
    public CommonResult updatePublishStatus(@RequestParam("ids") List<Long> ids,
                                            @RequestParam("publishStatus") Integer publishStatus) {
        int count = spuService.updatePublishStatus(ids, publishStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("批量设为新品")
    @PostMapping("/update/newStatus")
    public CommonResult updateNewStatus(@RequestParam("ids") List<Long> ids,
                                        @RequestParam("newStatus") Integer newStatus) {
        int count = spuService.updateNewStatus(ids, newStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("批量修改删除状态")
    @PostMapping("/update/deleteStatus")
    public CommonResult updateDeleteStatus(@RequestParam("ids") List<Long> ids,
                                           @RequestParam("deleteStatus") Integer deleteStatus) {
        int count = spuService.updateDeleteStatus(ids, deleteStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }


    // ---------------------------前台接口------------------------------------------

    @ApiOperation("以树形结构获取所有商品分类")
    @GetMapping("/categoryTreeList")
    public CommonResult<List<ProductCategoryNode>> categoryTreeList() {
        List<ProductCategoryNode> list = spuService.categoryTreeList();
        return CommonResult.success(list);
    }

    @ApiOperation("获取前台商品详情")
    @GetMapping("/detail/{id}")
    public CommonResult<ProductDetail> detail(@PathVariable Long id) {
        ProductDetail productDetail = spuService.detail(id);
        return CommonResult.success(productDetail);
    }
}
