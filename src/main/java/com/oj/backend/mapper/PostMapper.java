package com.oj.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oj.backend.model.entity.Post;
import java.util.Date;
import java.util.List;

/**
 * @Description: 帖子数据库操作
 * @Author: MING
 * @Date: 2024/03/05
 */

public interface PostMapper extends BaseMapper<Post> {

    /**
     * 查询帖子列表（包括已被删除的数据）
     */
    List<Post> listPostWithDelete(Date minUpdateTime);

}




