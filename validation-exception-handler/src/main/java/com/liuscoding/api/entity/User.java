package com.liuscoding.api.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @program: java-learning->User
 * @description: 用户实体类
 * @author: liushuai
 * @create: 2020-04-22 18:33
 **/
@Data
@ApiModel("用户")
public class User {

    @ApiModelProperty("用户id")
    private Long id ;

    @ApiModelProperty("用户账号")
    private String account;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("用户邮箱")
    private String email;
}
