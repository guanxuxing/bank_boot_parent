package com.boot.bank.controller;

import com.boot.bank.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by gxx on 2017-08-25.
 */
@Controller
public class TestController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "test")
    public String test(){
        userService.getUserById("666");
        return "test Boot";
    }
}
