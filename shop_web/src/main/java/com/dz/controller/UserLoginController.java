package com.dz.controller;


import com.dz.pojo.UserLogin;

import com.dz.service.UserLoginService;
import com.dz.util.SMS;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserLoginController {

    //跳转到登录页面

    @Autowired
    private UserLoginService userLoginService;


    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }

    @RequestMapping("/main")
    public String main(){
        return "user/main";
    }
    //跳转到注册页面
    @RequestMapping("/register")
    public String register() {
        return "user/register";
    }


    @RequestMapping("/tologin")
    public String tologin(String username, String password,Model model){
        UserLogin userLogin = userLoginService.findByLoginName(username);
        if(userLogin!=null && userLogin.getPassword().equals(password)){
            return "redirect:/main/home";
        }else{
            model.addAttribute("code","200");
            return "redirect:/user/login";
        }

    }



    @RequestMapping("/toregisterphone")
    public String toregister1(String username, String password1,String code){

        String code1 = SMS.getMessage(username);

        System.out.println(username+""+password1+" "+code+" "+code1);

        return "user/register";
    }

    @RequestMapping("/toregisteremail")
    public String toregister2(String username, String password1,String code){

        String code1 = SMS.getMessage(username);

        System.out.println(username+""+password1+" "+code+" "+code1);

        return "user/register";
    }


    @RequestMapping("/sendmessage")
    @ResponseBody
    public String sendmessage(String tel){

        //String code1 = SMS.getMessage(tel);

        System.out.println(tel+" ");
        return "666";

    }


}
