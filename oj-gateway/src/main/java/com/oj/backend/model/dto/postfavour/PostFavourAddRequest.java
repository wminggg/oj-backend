package com.oj.backend.model.dto.postfavour;

import java.io.Serializable;
import lombok.Data;

/**
 * @Description:
 * @Author: MING
 * @Date: 2024/03/05
 */

@Data
public class PostFavourAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}