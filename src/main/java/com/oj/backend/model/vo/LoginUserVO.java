package com.oj.backend.model.vo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @Description: 已登录用户视图（脱敏）
 * @Author: MING
 * @Date: 2024/03/05
 */

@Data
public class LoginUserVO implements Serializable {

    /**
     * 用户 id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 用户简介
     */
    private String userProfile;

    /**
     * 用户角色：user/admin/ban
     */
    private String userRole;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}