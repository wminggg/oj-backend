package com.oj.user.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求
 *
* @author wming
* @date 2024/04/06
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;
}
