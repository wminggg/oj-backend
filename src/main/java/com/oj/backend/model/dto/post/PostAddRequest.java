package com.oj.backend.model.dto.post;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * @Description: 创建请求
 * @Author: MING
 * @Date: 2024/03/05
 */

@Data
public class PostAddRequest implements Serializable {

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表
     */
    private List<String> tags;

    private static final long serialVersionUID = 1L;
}