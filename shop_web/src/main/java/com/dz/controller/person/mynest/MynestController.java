package com.dz.controller.person.mynest;


import com.dz.pojo.*;
import com.dz.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/person/mynest")
//我的小窝
public class MynestController {

    @Autowired
    //活动通知
    private ActivityService activityService;
    @Autowired
    //订单主表
    private OrderMasterService orderMasterService;
    @Autowired
    //商品评论表
    private ProductCommentService productCommentService;
    //商品表
    @Autowired
    private ProductService productService;


    //跳转到消息页面
    @RequestMapping("/news")
    public String news(Model model, HttpSession session) throws ParseException {
        //商城活动
        //查询所有活动、通知信息
        List<Activity> activityList = activityService.findAll();

        //获取当前时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //获取当前时间
        String d = sdf.format(date);
        //转换为日期格式
        Date date1 = sdf.parse(d);
        // Date date1 = sdf.parse(sdf.format(date));//获取当前时间并转换为日期格式

        //将当前日期字符串传至页面
        model.addAttribute("d", d);
        //创建新的List集合
        List<Activity> newList = new ArrayList<>();
        //循环活动 集合
        for (Activity ac : activityList) {
            //将创建时间字符串转换为日期格式
            Date createTime = sdf.parse(ac.getCreateTime());
            //判断活动创建日期是否为当前日期
            if (date1.getTime() == createTime.getTime()) {
                //将符合条件的 活动 放入新的集合
                newList.add(ac);

            }
        }
        //将符合条件的数据放入新的List集合  传入页面
        model.addAttribute("newList", newList);

        //交易信息 售后消息
        UserLogin userLogin = (UserLogin) session.getAttribute("userLogin");//通过session获取userLoginId
        //获取退款状态所有订单信息
        List<OrderMaster> orderMasterList = orderMasterService.fingByUserLoginId(userLogin.getId());
        //创建新的List集合
        List<List<String>> productNameList = new ArrayList<>();
        //循环判断信息
        for (OrderMaster om : orderMasterList) {
            //取得商品名称
            List<String> productName = orderMasterService.findProductName(om.getId());

            productNameList.add(productName);

        }
        //传入页面
        model.addAttribute("orderMasterList", orderMasterList);
        model.addAttribute("productNameList", productNameList);

        return "/person/mynest/news";
    }


    //跳转到详细信息页面
    @RequestMapping("/blog")
    public String blog(Model model, @RequestParam(value = "blog") Integer activityId) {
        model.addAttribute("activity", activityService.findById(activityId));
        Activity activity = activityService.findById(activityId);
        //字符串转数组
        String[] p = activity.getContent().split("。");
        model.addAttribute("p", p);

        return "/person/mynest/blog";
    }

    //跳转到收藏页面
    @RequestMapping("/collection")
    public String collection() {
        return "/person/mynest/collection";
    }

    //跳到足迹页面
    @RequestMapping("/foot")
    public String foot() {
        return "/person/mynest/foot";
    }

    //跳转到评论页面
    @RequestMapping("/comment")
    public String comment(Model model, HttpSession session) {
        //通过session 获取userId
        UserLogin userLogin = (UserLogin) session.getAttribute("userLogin");
        //通过userid获取所有评论
        List<ProductComment> productCommentList = productCommentService.findByUserId(userLogin.getId());
        //创建新的List集合存放结果
        List<List<ProductCommentPic>> productComments = new ArrayList<>();
        //循环评论
        for (ProductComment pcl:productCommentList){
            //获取评价照片集合
            List<ProductCommentPic> productCommentPicList = pcl.getProductCommentPicList();
            //获取订单商品信息
            Product product = productService.findById(pcl.getId());
        }



        return "/person/mynest/comment";
    }
}
