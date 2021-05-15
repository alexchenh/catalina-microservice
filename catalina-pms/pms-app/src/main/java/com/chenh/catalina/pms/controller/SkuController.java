package com.chenh.catalina.pms.controller;

import com.chenh.catalina.pms.service.SkuStockService;
import com.chenh.common.core.api.CommonResult;
import com.chenh.common.mybatis.model.PmsSkuStock;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品SKU库存管理Controller
 * @author chenh
 * @date 2021年04月22日
 */
@RestController
@Api(tags = "sku商品库存管理")
@RequestMapping("/sku")
public class SkuController {
    @Autowired
    private SkuStockService skuStockService;

    @ApiOperation("根据商品编号及sku编码模糊搜索sku库存")
    @GetMapping("/{pid}")
    public CommonResult<List<PmsSkuStock>> getList(@PathVariable Long pid, @RequestParam(value = "keyword",required = false) String keyword) {
        List<PmsSkuStock> skuStockList = skuStockService.getList(pid, keyword);
        return CommonResult.success(skuStockList);
    }
    @ApiOperation("批量更新sku库存信息")
    @PostMapping("/update/{pid}")
    public CommonResult update(@PathVariable Long pid, @RequestBody List<PmsSkuStock> skuStockList){
        int count = skuStockService.update(pid,skuStockList);
        if(count>0){
            return CommonResult.success(count);
        }else{
            return CommonResult.failed();
        }
    }
}

