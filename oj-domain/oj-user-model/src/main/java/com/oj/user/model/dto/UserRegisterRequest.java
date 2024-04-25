package com.oj.user.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
* @author wming
* @date 2024/04/06
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
