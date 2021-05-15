package com.chenh.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

/**
 * 用户登录参数
 * @author chenh
 * @date 2021年04月12日
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AdminLoginParam {

    @ApiModelProperty(value = "用户名",required = true)
    @NotEmpty
    private String username;

    @ApiModelProperty(value = "密码",required = true)
    @NotEmpty
    private String password;
}
