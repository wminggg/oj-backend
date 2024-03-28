package com.oj.backend.common;

import com.oj.backend.constant.CommonConstant;
import lombok.Data;

/**
 * @Description: 分页请求
 * @Author: MING
 * @Date: 2024/03/05
 */

@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
