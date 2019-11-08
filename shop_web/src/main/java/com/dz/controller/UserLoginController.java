package com.dz.controller;


import com.dz.pojo.UserLogin;

import com.dz.service.UserLoginService;
import com.dz.util.EmailUtil;
import com.dz.util.SMS;
import com.dz.util.UUIDKEY;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    //跳转到登录页面
    @RequestMapping("/login")
    public String login() {
        return "user/login";
    }

    //跳转到注册页面
    @RequestMapping("/register")
    public String register() {
        return "user/register";
    }


    //登录验证
    @RequestMapping("/tologin")
    public String tologin(String username, String password, Model model,HttpSession session) {
        UserLogin userLogin = userLoginService.findByLoginName(username);
        if (userLogin != null && userLogin.getPassword().equals(password)) {
            session.setAttribute("userLogin",userLogin);
            return "redirect:/main/home";
        } else {
            model.addAttribute("code", "200");
            return "redirect:/user/login";
        }

    }

    //手机号注册
    @RequestMapping("/toregisterphone")
    public String toregister1(String username, String password1,Model model) {

        UserLogin userLogin = userLoginService.findByLoginName(username);
        if(userLogin!=null){
            model.addAttribute("msg","phone");
            return "redirect:/user/register";
        }else{
            userLoginService.save(username,password1);
            model.addAttribute("msg","success");


            return "user/RCF";
        }

    }

    //邮箱注册
    @RequestMapping("/toregisteremail")
    public String toregister2(final String username, String password1, HttpSession session,Model model) {

        UserLogin userLogin = userLoginService.findByLoginName(username);
        if(userLogin!=null){
            model.addAttribute("msg","email");
            return "redirect:/user/register";
        }

        final String key = UUIDKEY.getKey();
        session.setAttribute("key",key);
        session.setAttribute("username",username);
        session.setAttribute("password1",password1);
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                String msg = "<html><head><title>请点击复制链接或在新的窗口打开完成注册</title></head><body>" +
                        "<h3>请复制链接在新的窗口打开完成注册</h3><span>http://localhost:8080/user/toRCF?key=" + key +"</span><h3>注意：30分钟内有效</h3></body></html>";
                EmailUtil.sendHTMLEmail("用户注册确认！", msg, username);
            }
        });
        th.start();
        System.out.println(username + "" + password1);

        return "user/RCF";
    }


    //手机注册发送验证码
    @RequestMapping("/sendmessage")
    @ResponseBody
    public String sendmessage(String tel) {
        String code = SMS.getMessage(tel);
        //session.setAttribute("code",code);
        return code;
    }


    //邮箱注册确认
    @RequestMapping("/toRCF")
    public String toRCF(String key,HttpSession session,Model model) {
        String key1 = (String) session.getAttribute("key");
        String username = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password1");
        if(key!=null&&key.equals(key1)){
            model.addAttribute("msg","验证成功");
            userLoginService.save(username,password);
        }else{
            model.addAttribute("msg","验证失败，请重试");
        }
        session.removeAttribute("key");
        session.removeAttribute("username");
        session.removeAttribute("password1");
        return "user/RCF";
    }


}
