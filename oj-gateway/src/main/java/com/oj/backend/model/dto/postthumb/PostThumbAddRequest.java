package com.oj.backend.model.dto.postthumb;

import java.io.Serializable;
import lombok.Data;

/**
 * @Description: 帖子点赞请求
 * @Author: MING
 * @Date: 2024/03/05
 */

@Data
public class PostThumbAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}