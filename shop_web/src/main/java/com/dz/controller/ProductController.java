package com.dz.controller;

import com.dz.pojo.Product;
import com.dz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/introduction")
    public String introduction(Integer productId, Model model){

        Product product = productService.findById(productId);
        model.addAttribute("product", product);
        return "product/introduction";
    }

    @RequestMapping("/search")
    public String search(){
        return "product/search";
    }

}
