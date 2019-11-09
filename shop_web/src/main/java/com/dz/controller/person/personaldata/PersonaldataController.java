package com.dz.controller.person.personaldata;


import com.dz.pojo.Address;
import com.dz.pojo.SafeQuestion;
import com.dz.pojo.UserLogin;
import com.dz.pojo.UserMessage;
import com.dz.service.AddressService;
import com.dz.service.SafeQuestionService;
import com.dz.service.UserLoginService;
import com.dz.service.UserMessageService;
import com.dz.util.EmailUtil;
import com.dz.util.SMS;
import com.dz.util.UUIDKEY;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/person/personaldata")
public class PersonaldataController  {
    @Autowired
    private  UserMessageService userMessageService;
    @Autowired
    private UserLoginService userLoginService;
    @Autowired
    private SafeQuestionService safeQuestionService;
    @Autowired
    private AddressService addressService;

    //跳转到个人信息页面
    @RequestMapping("/information")
    public String information(Model model) {
        UserLogin userLogin = userLoginService.findUserNameById(1);
        UserMessage userMessage = userMessageService.findByUid(1);
        model.addAttribute("userLogin",userLogin);
        model.addAttribute("userMessage",userMessage);
        return "/person/personaldata/information";
    }
    //跳转到安全设置页面
    @RequestMapping("/safety")
    public String safety(Model model){
        UserMessage userMessage = userMessageService.findByUid(1);
        model.addAttribute("userMessage",userMessage);
        return "/person/personaldata/safety";
    }
    //跳转到收获地址页面
    @RequestMapping("/address")
    public String address(Model model){
        UserLogin userLogin = userLoginService.findUserNameById(1);
        UserMessage userMessage = userMessageService.findByUid(1);
        Address address = addressService.findByUid(1);
        model.addAttribute("userLogin",userLogin);
        model.addAttribute("userMessage",userMessage);
        model.addAttribute("address",address);
        return "/person/personaldata/address";
    }
    //修改地址
    @RequestMapping(value = "/updateAddress",method = RequestMethod.POST)
    public String updateAddress(Address address,String prov,String city1,String county,String content){
       String province = prov;
       String city = city1;
       String district = county;
        content = prov+"-"+city1+"-"+county;
        addressService.updateAddress(province,city,district);
        addressService.updateMd(address);
        addressService.updateContent(content);
        return "redirect:/person/personaldata/address";
    }
    //跳转到修改密码页面
    @RequestMapping("/password")
    public String changepassword(Model model){
        UserLogin userLogin = userLoginService.findAll(1);
        model.addAttribute("userLogin",userLogin);
        return "/person/personaldata/password";
    }

    //跳转到支付密码页面
    @RequestMapping("/setpay")
    public String setpay(Model model){
        UserLogin userLogin = userLoginService.findUserNameById(1);
        UserMessage userMessage = userMessageService.findByUid(1);
        model.addAttribute("userLogin",userLogin);
        model.addAttribute("userMessage",userMessage);
        return "/person/personaldata/setpay";
    }

    //保存支付密码
    @RequestMapping(value = "/savepassword",method = RequestMethod.POST)
    public String save(UserMessage userMessage){
     userMessageService.updatepaypwd(userMessage);
        return "redirect:/person/personaldata/setpay";
    }

    //手机注册发送验证码
    @RequestMapping("/sendCode")
    @ResponseBody
    public String sendmessage(String tel) {
        String code = SMS.getMessage(tel);
        return code;
    }
    //跳转到手机验证页面
    @RequestMapping("/bindphone")
    public String bindphone(Model model){
        UserLogin userLogin = userLoginService.findUserNameById(1);
        UserMessage userMessage = userMessageService.findByUid(1);
        model.addAttribute("userLogin",userLogin);
        model.addAttribute("userMessage",userMessage);
        return "/person/personaldata/bindphone";
    }
    //修改手机号
    @RequestMapping(value = "/changetel",method = RequestMethod.POST)
    public String changeTel(String tel){
        userMessageService.updateTel(tel);
        return "redirect:/person/personaldata/bindphone";
    }
    //跳转到邮箱验证页面
    @RequestMapping("/email")
    public String email(Model model){
        UserLogin userLogin = userLoginService.findUserNameById(1);
        UserMessage userMessage = userMessageService.findByUid(1);
        model.addAttribute("userLogin",userLogin);
        model.addAttribute("userMessage",userMessage);
        return "/person/personaldata/email";
    }
    //发送邮件
    @RequestMapping(value = "/sendMsg",method = RequestMethod.POST)
    public String sendMsg(String email){
        userMessageService.updateEmail(email);
        final String code= UUIDKEY.getKey();
        Thread th = new Thread(new Runnable() {
            @Override
            public void run(){
                String msg = "您的验证码是："+code;
                EmailUtil.sendSimpleEmail("验证通知！",msg,"1246127773@qq.com");
            }
        });
        th.start();
        return "redirect:/person/personaldata/email";
    }
    //跳转到实名认证页面
    @RequestMapping("/idcard")
    public String idcard(Model model){
        UserLogin userLogin = userLoginService.findUserNameById(1);
        UserMessage userMessage = userMessageService.findByUid(1);
        model.addAttribute("userLogin",userLogin);
        model.addAttribute("userMessage",userMessage);
        return "/person/personaldata/idcard";
    }
    //进行实名认证
    @RequestMapping(value = "/realName",method = RequestMethod.POST)
    public String realName(String idcard){
        userMessageService.updateIdCard(idcard);
        return "redirect:/person/personaldata/idcard";
    }

    //跳转到设置安全问题页面
    @RequestMapping("/question")
    public String question(Model model){
        UserLogin userLogin = userLoginService.findAll(1);
        List<SafeQuestion> safeQuestionList = safeQuestionService.findByUid(1);
        model.addAttribute("userLogin",userLogin);
        model.addAttribute("safeQuestionList",safeQuestionList);
        return "/person/personaldata/question";
    }
    //问题
    @RequestMapping(value = "/updateQuestion",method = RequestMethod.POST)
    public String updateQuestion(SafeQuestion safeQuestion){
        safeQuestionService.updateQuestion(safeQuestion);
        return "redirect:/person/personaldata/question";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(UserMessage userMessage,String sel1,String sel2,String sel3)  {
        userMessageService.updateInfo(userMessage);
        String birthday =sel1 + "-" +sel2 + "-" +sel3;
        userMessageService.updateBirthday(birthday);
        return "redirect:/person/personaldata/information";
    }

    //修改密码
    @RequestMapping(value = "/updatePwd",method = RequestMethod.POST)
    public String updatePwd(UserLogin userLogin){
        userLoginService.updatePwd(userLogin);
        return "redirect:/person/personaldata/password";
    }
}
