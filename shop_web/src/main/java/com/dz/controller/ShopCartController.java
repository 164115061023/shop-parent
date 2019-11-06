package com.dz.controller;

import com.dz.pojo.ShoppingCart;
import com.dz.pojo.UserLogin;
import com.dz.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/shopcart")
public class ShopCartController {

    @Autowired
    private ShopCartService shopCartService;

    @RequestMapping("/shopcart")
    public String shopcart(){
        return "product/shopcart";
    }

    @RequestMapping("/toshopcart")
    public String toshopcart(HttpSession session){

        UserLogin userLogin = (UserLogin) session.getAttribute("userLogin");

       // List<ShoppingCart>shopCartService.findAllByUserLoginId(userLogin.getId());

        return "product/shopcart";
    }

}
