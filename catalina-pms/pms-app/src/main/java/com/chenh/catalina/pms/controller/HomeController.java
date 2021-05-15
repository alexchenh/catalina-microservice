package com.chenh.catalina.pms.controller;

import com.chenh.catalina.pms.dto.HomeContentResult;
import com.chenh.catalina.pms.service.HomeService;
import com.chenh.common.core.api.CommonResult;
import com.chenh.common.mybatis.model.PmsProduct;
import com.chenh.common.mybatis.model.PmsProductCategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 首页内容管理Controller
 * @author chenh
 * @date 2021年05月01日
 */
@Controller
@Api(tags = "首页内容管理")
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @ApiOperation("首页内容页信息展示")
    @GetMapping("/content")
    public CommonResult<HomeContentResult> content() {
        HomeContentResult contentResult = homeService.content();
        return CommonResult.success(contentResult);
    }

    @ApiOperation("分页获取新品推荐商品")
    @GetMapping("/newProductList")
        public CommonResult<List<PmsProduct>> newProductList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                             @RequestParam(value = "pageSize", defaultValue = "6") Integer pageSize) {
        List<PmsProduct> productList = homeService.newProductList(pageNum,pageSize);
        return CommonResult.success(productList);
    }

    @ApiOperation("分页获取人气推荐商品")
    @GetMapping("/hotProductList")
    public CommonResult<List<PmsProduct>> hotProductList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                         @RequestParam(value = "pageSize", defaultValue = "6") Integer pageSize) {
        List<PmsProduct> productList = homeService.hotProductList(pageNum,pageSize);
        return CommonResult.success(productList);
    }

    @ApiOperation("获取首页商品分类")
    @GetMapping("/productCateList/{parentId}")
    public CommonResult<List<PmsProductCategory>> getProductCateList(@PathVariable Long parentId) {
        List<PmsProductCategory> productCategoryList = homeService.getProductCateList(parentId);
        return CommonResult.success(productCategoryList);
    }
}
