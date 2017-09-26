package org.csu.coder.lee.controller;

import org.csu.coder.lee.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by lixiang on 2017 09 20 13:43.
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public Object index(String api_name) {
        return "success";
    }

    @GetMapping("/login")
    public Object login(String api_name) {
        return "login";
    }

    @GetMapping("/user")
    public Object user(String api_name) {
        User user = new User().setId(111111L).setSex(false).setCreated(new Date());
        return user;
    }
}
