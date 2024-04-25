package com.oj.user.svc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oj.user.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户数据库操作
 *
* @author wming
* @date 2024/04/06
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




