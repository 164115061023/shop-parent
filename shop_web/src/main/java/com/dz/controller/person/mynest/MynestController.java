package com.dz.controller.person.mynest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person/mynest")
//我的小窝
public class MynestController {
    //跳转到消息页面
    @RequestMapping("/news")
    public String news(){
        return "/person/mynest/news";
    }
    //跳转到详细信息页面
    @RequestMapping("/blog")
    public String blog(){
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
        return "/person/mynest/comment";
    }
}
