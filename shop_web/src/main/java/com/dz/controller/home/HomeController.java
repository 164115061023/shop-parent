package com.dz.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    //跳转到首页
    @RequestMapping("/home")
    public String home(){
        return "home/home";
    }


}