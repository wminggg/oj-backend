package com.oj.common.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
* @author wming
* @date 2024/04/06
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}