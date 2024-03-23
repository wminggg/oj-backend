package com.oj.backend.service;

import com.oj.backend.model.entity.PostThumb;
import com.baomidou.mybatisplus.extension.service.IService;
import com.oj.backend.model.entity.User;

/**
 * @Description: 帖子点赞服务
 * @Author: MING
 * @Date: 2024/03/05
 */

public interface PostThumbService extends IService<PostThumb> {

    /**
     * 点赞
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doPostThumbInner(long userId, long postId);
}
