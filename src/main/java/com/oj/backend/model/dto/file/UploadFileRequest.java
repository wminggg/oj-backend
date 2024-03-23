package com.oj.backend.model.dto.file;

import java.io.Serializable;
import lombok.Data;

/**
 * @Description: 文件上传请求
 * @Author: MING
 * @Date: 2024/03/05
 */

@Data
public class UploadFileRequest implements Serializable {

    /**
     * 业务
     */
    private String biz;

    private static final long serialVersionUID = 1L;
}