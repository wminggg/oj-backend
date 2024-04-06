package com.oj.storage.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件上传请求
 *
 * @author wming
 * @date 2024/04/06
 */
@Data
public class UploadFileRequest implements Serializable {

    /**
     * 业务
     */
    private String biz;

    private static final long serialVersionUID = 1L;
}