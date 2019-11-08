package com.dz.controller;

import com.dz.pojo.ShoppingCart;
import com.dz.pojo.UserLogin;
import com.dz.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/shopcart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shopCartService;

    @RequestMapping("/shopcart")
    public String shopcart(HttpSession session, Model model){

        UserLogin userLogin = (UserLogin) session.getAttribute("userLogin");

        List<ShoppingCart> shoppingCartList = shopCartService.findAllByUserLoginId(userLogin.getId());
        double sum=0;
        for(int i=0; i<shoppingCartList.size(); i++){
            sum+=(shoppingCartList.get(i).getProduct().getCurrent_price())*(shoppingCartList.get(i).getProductAmount());
        }

        model.addAttribute("sum",sum);
        model.addAttribute("shoppingCartList",shoppingCartList);

        return "product/shopcart";
    }

    /*@RequestMapping("/toshopcart")
    @ResponseBody
    public int toshopcart(HttpSession session){

        UserLogin userLogin = (UserLogin) session.getAttribute("userLogin");

        List<ShoppingCart> shoppingCartList = shopCartService.findAllByUserLoginId(userLogin.getId());

        return shoppingCartList;
    }*/

    @RequestMapping("/querynum")
    @ResponseBody
    public int queryNum(HttpSession session){

        UserLogin userLogin = (UserLogin) session.getAttribute("userLogin");

        int num = shopCartService.queryNum(userLogin.getId());

        System.out.println(num);
        return num;
    }


    @RequestMapping("/delete")
    @ResponseBody
    public String deleteById(int id){

        //todo

        return "true";
    }




}
