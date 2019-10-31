package com.dz.dao;

import com.dz.pojo.Activity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ActivityDao {
    //查找活动信息
    @Select("select id,activity_type activityType,activity_title activityTitle,content,create_time createTime,pic from activity")
    List<Activity> findAll();
}