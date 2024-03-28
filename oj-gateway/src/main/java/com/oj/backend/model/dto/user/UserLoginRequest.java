package com.oj.backend.model.dto.user;

import java.io.Serializable;
import lombok.Data;

/**
 * @Description: 用户登录请求
 * @Author: MING
 * @Date: 2024/03/05
 */

@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;
}
