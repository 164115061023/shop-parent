package com.dz.controller.person.personaldata;

import com.dz.pojo.UserMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person/personaldata")
public class PersonaldataController {

    //跳转到个人信息页面
    @RequestMapping("/information")
    public String information(){
        return "/person/personaldata/information";
    }
    //跳转到安全设置页面
    @RequestMapping("/safety")
    public String safety(){
        return "/person/personaldata/safety";
    }
    //跳转到收获地址页面
    @RequestMapping("/address")
    public String address(){
        return "/person/personaldata/address";
    }
    //跳转到修改密码页面
    @RequestMapping("/password")
    public String changepassword(){
        return "/person/personaldata/password";
    }
    //跳转到支付密码页面
    @RequestMapping("/setpay")
    public String setpay(){
        return "/person/personaldata/setpay";
    }
    //跳转到手机验证页面
    @RequestMapping("/bindphone")
    public String bindphone(){
        return "/person/personaldata/bindphone";
    }
    //跳转到邮箱验证页面
    @RequestMapping("/email")
    public String email(){
        return "/person/personaldata/email";
    }
    //跳转到实名认证页面
    @RequestMapping("/idcard")
    public String idcard(){
        return "/person/personaldata/idcard";
    }

    //跳转到安全问题页面
    @RequestMapping("/question")
    public String question(){
        return "/person/personaldata/question";
    }

    //修改个人信息
    @RequestMapping("/changePersonInfo")
    public String changePersonInfo(){
        UserMessage userMessage = new UserMessage();


        return "/person/personaldata/information";
    }
}
