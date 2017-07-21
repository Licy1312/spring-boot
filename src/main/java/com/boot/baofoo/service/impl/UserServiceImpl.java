package com.boot.baofoo.service.impl;

import com.boot.baofoo.mapper.IUserMapper;
import com.boot.baofoo.model.User;
import com.boot.baofoo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 * Created by BF100395 on 2017/7/21.
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    /**
     * 增加用户，返回用户的编号
     * @param user
     * @return 用户编号
     */
    @Override
    public long addUser(User user) {
        return 0;
    }
}
