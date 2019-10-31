package com.dz.controller.person.mynest;

import com.dz.pojo.Activity;
import com.dz.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/person/mynest")
//我的小窝
public class MynestController {

    @Autowired
    private  ActivityService activityService;

    //跳转到消息页面
    @RequestMapping("/news")
    public String news(HttpServletRequest request){
        List<Activity> activitys = activityService.findAll();

        request.setAttribute("activityList",activitys);
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
