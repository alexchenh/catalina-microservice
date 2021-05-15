package com.chenh.admin.service;

import com.chenh.common.mybatis.model.UmsAdmin;

/**
 * 后台用户缓存操作Service
 * @author chenh
 * @date 2021年04月12日
 */
public interface AdminCacheService {
    /**
     * 删除后台用户缓存
     */
    void delAdmin(Long adminId);

    /**
     * 获取缓存后台用户信息
     */
    UmsAdmin getAdmin(Long adminId);

    /**
     * 设置缓存后台用户信息
     */
    void setAdmin(UmsAdmin admin);
}
