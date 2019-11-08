package com.dz.controller.person.order;

import com.dz.pojo.Product;
import com.dz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person/order")
public class OrderController {

    @Autowired
    private ProductService productService;
    //跳转到订单管理页面
    @RequestMapping("/order")
    public String order(Model model){
        Product product = productService.findAll(1);
        model.addAttribute("product",product);
        return "/person/order/order";
    }

//跳到退款售后页面
    @RequestMapping("/change")
    public String change(){
        return "/person/order/change";
    }
    //跳转到钱款去向页面
    @RequestMapping("/record")
    public String record(){
        return "/person/order/record";
    }
    //跳转到评价商品页面
    @RequestMapping("/commentlist")
    public String commentlist(){
        return "/person/order/commentlist";
    }
    //跳转到查看物流页面
    @RequestMapping("/logistics")
    public String logistics(){
        return "/person/order/logistics";
    }
    //跳转到订单详情页面
    @RequestMapping("/orderinfo")
    public String orderinfo(){
        return "/person/order/orderinfo";
    }
    //跳转到退款管理页面
    @RequestMapping("/refund")
    public String refund(){
        return "/person/order/refund";
    }
}
