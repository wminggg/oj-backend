package com.oj.backend.model.dto.user;

import java.io.Serializable;
import lombok.Data;

/**
 * @Description: 用户注册请求体
 * @Author: MING
 * @Date: 2024/03/05
 */

@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
