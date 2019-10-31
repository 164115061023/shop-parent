package com.dz.controller.person.personaldata;


import com.dz.pojo.UserLogin;
import com.dz.pojo.UserMessage;
import com.dz.service.UserLoginService;
import com.dz.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/person/personaldata")
public class PersonaldataController  {
    @Autowired
    private  UserMessageService userMessageService;
    private UserLoginService userLoginService;


    //跳转到个人信息页面
    @RequestMapping("/information")
    public String information() {
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


    @RequestMapping("/update")
    public String update(HttpServletRequest request){
        UserMessage userMessage = new UserMessage();
        UserLogin userLogin = new UserLogin();
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");

        String tel = request.getParameter("tel");
        String email = request.getParameter("email");
        String birthday = request.getParameter("birthday");
        userMessage.setName(name);
        userMessage.setSex(sex);

        userMessage.setTel(tel);
        userMessage.setEmail(email);
        userMessage.setBirthday(birthday);
        userMessageService.changeInfoById(userMessage.getUserLoginId());
        userLoginService.findUserNameById(userLogin.getId());
        return "/person/personaldata/information";
    }


}
