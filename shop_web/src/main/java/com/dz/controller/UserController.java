package com.dz.controller;

import com.dz.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    //跳转到登录页面
    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }
    /*@RequestMapping("/main")
    public String main(){
        return "user/main";
    }*/
    //跳转到注册页面
    @RequestMapping("/register")
    public String register(){
        return "user/register";
    }
}
