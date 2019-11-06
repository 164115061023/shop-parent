package com.dz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product/pay")
public class ProductPayController {

    @RequestMapping("/pay")
    public String pay(){
        return "product/pay/pay";
    }

    @RequestMapping("/success")
    public String success(){
        return "product/pay/success";
    }


}
