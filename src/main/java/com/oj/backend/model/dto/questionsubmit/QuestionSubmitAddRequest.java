package com.oj.backend.model.dto.questionsubmit;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 创建请求
 * @Author: MING
 * @Date: 2024/03/21
 */

@Data
public class QuestionSubmitAddRequest implements Serializable {

    /**
     * 编程语言
     */
    private String language;

    /**
     * 用户代码
     */
    private String code;

    /**
     * 题目 id
     */
    private Long questionId;

    private static final long serialVersionUID = 1L;
}