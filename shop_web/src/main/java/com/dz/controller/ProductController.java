package com.dz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/introduction")
    public String introduction(){
        return "product/introduction";
    }

    @RequestMapping("/search")
    public String search(){
        return "product/search";
    }

}
