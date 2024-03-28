package com.oj.backend.common;

import java.io.Serializable;
import lombok.Data;

/**
 * @Description: 删除请求
 * @Author: MING
 * @Date: 2024/03/05
 */

@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}