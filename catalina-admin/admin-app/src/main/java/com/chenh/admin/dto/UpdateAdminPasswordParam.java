package com.chenh.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * 修改用户名密码参数
 * @author chenh
 * @date 2021年04月12日
 */
@Getter
@Setter
public class UpdateAdminPasswordParam {

    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty
    private String username;

    @ApiModelProperty(value = "旧密码", required = true)
    @NotEmpty
    private String oldPassword;

    @ApiModelProperty(value = "新密码", required = true)
    @NotEmpty
    private String newPassword;
}
