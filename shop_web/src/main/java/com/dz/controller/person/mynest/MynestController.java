package com.dz.controller.person.mynest;


import com.dz.pojo.Activity;
import com.dz.pojo.AfterSale;
import com.dz.pojo.Product;
import com.dz.pojo.UserLogin;
import com.dz.service.ActivityService;
import com.dz.service.AfterSaleService;
import com.dz.service.OrderMasterService;
import com.dz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/person/mynest")
//我的小窝
public class MynestController {

    @Autowired
    //活动通知
    private  ActivityService activityService;
    @Autowired
    //订单表
    private OrderMasterService orderMasterService;
    @Autowired
    //产品表
    private ProductService productService;
    @Autowired
    //售后表
    private AfterSaleService afterSaleService;


    //跳转到消息页面
    @RequestMapping("/news")
    public String news(Model model, HttpSession session){
        //商城活动
        model.addAttribute("activityList", activityService.findAll());
        //物流助手  做不了


        //交易信息 售后消息
        //通过session获取userLoginId
        UserLogin userLogin = (UserLogin) session.getAttribute("userLogin");


        model.addAttribute("afterSaleList",afterSaleService.findByUserLoginId(userLogin.getId()));





        return "/person/mynest/news";
    }


    //跳转到详细信息页面
    @RequestMapping("/blog")
    public String blog(Model model,@RequestParam(value = "blog")Integer activityId){
        model.addAttribute("activity",activityService.findById(activityId));
        Activity activity = activityService.findById(activityId);
        //字符串转数组
        String[] p = activity.getContent().split("。");
        model.addAttribute("p",p);
        return "/person/mynest/blog";
    }
    //跳转到收藏页面
    @RequestMapping("/collection")
    public String collection(){
        return "/person/mynest/collection";
    }
    //跳到足迹页面
    @RequestMapping("/foot")
    public String foot(){
        return "/person/mynest/foot";
    }
    //跳转到评论页面
    @RequestMapping("/comment")
    public String comment(){
        //通过session 获取userId


        return "/person/mynest/comment";
    }
}
