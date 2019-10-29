package com.dz.controller;

import com.dz.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login2")
    public String login(){
        return "user/login2";
    }

    /*@RequestMapping("/main")
    public String main(){
        return "user/main";
    }*/

    @RequestMapping("/tologin")
    public String tologin(User user, Model model){
        try {
            SecurityUtils.getSubject().login(
                    new UsernamePasswordToken(user.getUsername(), user.getPassword()));
        } catch (AuthenticationException e) {
            e.printStackTrace();
            model.addAttribute("msg","用户名或密码错误");
            return "user/login2";
        }
        return "user/main";
    }
}
