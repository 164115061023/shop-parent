package com.dz.controller.person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/person")
public class IndexController {
    //跳转到个人中心
    @RequestMapping("/index")
    public String persion(){
        return "person/index";
    }

}
