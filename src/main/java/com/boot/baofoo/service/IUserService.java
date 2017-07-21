package com.boot.baofoo.service;

import com.boot.baofoo.model.User;

/**
 * 用户服务
 * Created by BF100395 on 2017/7/20.
 */
public interface IUserService {

    /**
     * 增加用户，返回用户的编号
     * @param user
     * @return
     */
    long addUser(User user);
}
