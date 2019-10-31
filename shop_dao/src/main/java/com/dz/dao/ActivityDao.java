package com.dz.dao;

import com.dz.pojo.Activity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ActivityDao {
    //查找所有活动信息
    @Select("select id,activity_type activityType,activity_title activityTitle,content,create_time createTime,pic from activity")
    List<Activity> findAll();
   //通过id查找消息
    @Select("select id,activity_type activityType,activity_title activityTitle,content,create_time createTime,pic from activity where id = #{id}")
    Activity findById(Integer id);
}
