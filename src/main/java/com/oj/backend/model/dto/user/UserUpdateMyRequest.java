package com.oj.backend.model.dto.user;

import java.io.Serializable;
import lombok.Data;

/**
 * @Description: 用户更新个人信息请求
 * @Author: MING
 * @Date: 2024/03/05
 */

@Data
public class UserUpdateMyRequest implements Serializable {

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 简介
     */
    private String userProfile;

    private static final long serialVersionUID = 1L;
}