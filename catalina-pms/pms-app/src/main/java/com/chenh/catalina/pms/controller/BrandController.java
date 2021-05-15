package com.chenh.catalina.pms.controller;

import com.chenh.catalina.pms.dto.BrandParam;
import com.chenh.catalina.pms.service.BrandService;
import com.chenh.common.core.api.CommonPage;
import com.chenh.common.core.api.CommonResult;
import com.chenh.common.mybatis.model.PmsBrand;
import com.chenh.common.mybatis.model.PmsProduct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品品牌管理Controller
 * @author chenh
 * @date 2021年04月22日
 */
@RestController
@Api(tags = "商品品牌管理")
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @ApiOperation("获取全部品牌列表")
    @GetMapping("/listAll")
    public CommonResult<List<PmsBrand>> getList() {
        return CommonResult.success(brandService.listAllBrand());
    }

    @ApiOperation("添加品牌")
    @PostMapping("/create")
    public CommonResult create(@Validated @RequestBody BrandParam pmsBrand) {
        CommonResult commonResult;
        int count = brandService.createBrand(pmsBrand);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @ApiOperation("更新品牌")
    @PostMapping("/update/{id}")
    public CommonResult update(@PathVariable("id") Long id,
                               @Validated @RequestBody BrandParam pmsBrandParam) {
        CommonResult commonResult;
        int count = brandService.updateBrand(id, pmsBrandParam);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @ApiOperation("删除品牌")
    @GetMapping("/delete/{id}")
    public CommonResult delete(@PathVariable("id") Long id) {
        int count = brandService.deleteBrand(id);
        if (count == 1) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据品牌名称分页获取品牌列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<PmsBrand>> getList(@RequestParam(value = "keyword", required = false) String keyword,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        List<PmsBrand> brandList = brandService.listBrand(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }

    @ApiOperation("根据编号查询品牌信息")
    @GetMapping("/{id}")
    public CommonResult<PmsBrand> getItem(@PathVariable("id") Long id) {
        return CommonResult.success(brandService.getBrand(id));
    }

    @ApiOperation("批量删除品牌")
    @PostMapping("/delete/batch")
    public CommonResult deleteBatch(@RequestParam("ids") List<Long> ids) {
        int count = brandService.deleteBrand(ids);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("批量更新显示状态")
    @PostMapping("/update/showStatus")
    public CommonResult updateShowStatus(@RequestParam("ids") List<Long> ids,
                                         @RequestParam("showStatus") Integer showStatus) {
        int count = brandService.updateShowStatus(ids, showStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("批量更新厂家制造商状态")
    @PostMapping("/update/factoryStatus")
    public CommonResult updateFactoryStatus(@RequestParam("ids") List<Long> ids,
                                            @RequestParam("factoryStatus") Integer factoryStatus) {
        int count = brandService.updateFactoryStatus(ids, factoryStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }


// ---------------------以下为前台接口---------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------

    @ApiOperation("获取品牌详情")
    @GetMapping("/detail/{brandId}")
    public CommonResult<PmsBrand> detail(@PathVariable Long brandId) {
        PmsBrand brand = brandService.detail(brandId);
        return CommonResult.success(brand);
    }

    @ApiOperation("分页获取品牌相关商品")
    @GetMapping("/productList")
    public CommonResult<CommonPage<PmsProduct>> productList(@RequestParam Long brandId,
                                                            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                            @RequestParam(value = "pageSize", defaultValue = "6") Integer pageSize) {
        CommonPage<PmsProduct> result = brandService.productList(brandId,pageNum, pageSize);
        return CommonResult.success(result);
    }
}
