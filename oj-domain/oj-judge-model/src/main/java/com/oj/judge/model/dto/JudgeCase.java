package com.oj.judge.model.dto;

import lombok.Data;

/**
 * 题目用例
 *
 * @author wming
 * @date 2024/04/06
 */
@Data
public class JudgeCase {

    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;
}
