package com.chenh.catalina.pms.service;

import com.chenh.catalina.pms.dao.SkuStockDao;
import com.chenh.common.mybatis.mapper.PmsSkuStockMapper;
import com.chenh.common.mybatis.model.PmsSkuStock;
import com.chenh.common.mybatis.model.PmsSkuStockExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 商品SKU库存管理Service实现类
 * @author chenh
 * @date 2021年04月22日
 */
@Service
public class SkuStockServiceImpl implements SkuStockService {
    @Autowired
    private PmsSkuStockMapper skuStockMapper;
    @Autowired
    private SkuStockDao skuStockDao;

    @Override
    public List<PmsSkuStock> getList(Long pid, String keyword) {
        PmsSkuStockExample example = new PmsSkuStockExample();
        PmsSkuStockExample.Criteria criteria = example.createCriteria().andProductIdEqualTo(pid);
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSkuCodeLike("%" + keyword + "%");
        }
        return skuStockMapper.selectByExample(example);
    }

    @Override
    public int update(Long pid, List<PmsSkuStock> skuStockList) {
        return skuStockDao.replaceList(skuStockList);
    }
}
