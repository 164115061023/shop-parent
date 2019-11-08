package com.dz.controller;

import com.dz.pojo.Product;
import com.dz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/home")
    public String home(Model model){

        //今日推荐商品查找
        List<Product> productList = productService.findByRecommend();

        System.out.println(productList.size());

        model.addAttribute("productList",productList);




        return "main/home";
    }






}
