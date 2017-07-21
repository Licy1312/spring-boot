package com.boot.baofoo.controller;

import com.boot.baofoo.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 主页控制器
 * Created by BF100395 on 2017/5/27.
 */
@RestController
public class IndexController {

    private static final String template ="Hello,%s";

    private final AtomicLong counter = new AtomicLong();
    /**
     * 主页访问
     * @return
     */
    @RequestMapping("/user/{name}")
    public User index(@PathVariable(value="name")String name){
//        User user = new User();
        return null;
    }
    @RequestMapping("/users")
    public User user(@RequestParam(value="name",defaultValue="SpringBoot")String name){
//        User user = new User();
        return null;
    }
}
