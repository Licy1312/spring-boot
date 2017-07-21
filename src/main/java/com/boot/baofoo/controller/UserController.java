package com.boot.baofoo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BF100395 on 2017/7/21.
 */
@RestController
public class UserController {

    @RequestMapping("/user/login")
    public String login(){
        return "login";
    }
}
