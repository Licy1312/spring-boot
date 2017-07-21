package com.boot.baofoo.mapper;

import com.boot.baofoo.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户DDL接口
 * Created by BF100395 on 2017/7/12.
 */
public interface IUserMapper {

    int addUser(@Param("user") User user);
}
