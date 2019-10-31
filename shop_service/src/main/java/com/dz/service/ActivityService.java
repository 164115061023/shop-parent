package com.dz.service;

import com.dz.dao.ActivityDao;
import com.dz.pojo.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityDao activityDao;
    //查找所有活动信息
    public List<Activity> findAll() {
        return activityDao.findAll();
    }
    //通过id查找消息
    public Activity findById(Integer id){
        return activityDao.findById(id);
    }

}
