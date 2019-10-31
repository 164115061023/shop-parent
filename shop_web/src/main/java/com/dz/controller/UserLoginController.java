package com.dz.controller;

import com.dz.pojo.User;
import com.dz.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }

    @RequestMapping("/tologin")
    public String tologin(String username, String password, Model model){
        User user = userLoginService.findByLoginName(username);
        if(user!=null && user.getPassword().equals(password)){
            return "redirect:/main/home";
        }else{
            model.addAttribute("code","200");
            return "redirect:/user/login";
        }
    }

    @RequestMapping("/register")
    public String register(){
        return "user/register";
    }


    @RequestMapping("/toregister")
    public String toregister(String username, String password1){

        System.out.println(username+" "+password1);


        return "user/register";
    }



}
