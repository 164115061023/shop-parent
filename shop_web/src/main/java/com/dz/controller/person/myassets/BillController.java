package com.dz.controller.person.myassets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person/myassets")
// 我的资产
public class BillController {

    //跳转到账单明细页面
    @RequestMapping("/bill")
    public String bill(){
        return "person/myassets/bill";
    }
    //跳转到查看收入明细页面
    @RequestMapping("/billlist")
    public String billlist(){
        return "person/myassets/billlist";
    }
    //跳转到红包页面
    @RequestMapping("/bonus")
    public String bonus(){
        return "person/myassets/bonus";
    }
    //跳转到优惠劵页面
    @RequestMapping("/coupon")
    public String coupon(){
        return "person/myassets/coupon";
    }
}
