package com.dz.dao;

import com.dz.pojo.Activity;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ActivityDao {
    //查找所有活动信息
    @Select("select  * from activity")
    @Results({
            @Result(column = "activity_type",property = "activityType"),
            @Result(column = "activity_title",property = "activityTitle"),
            @Result(column = "create_time",property = "createTime")
    })
    List<Activity> findAll();
   //通过id查找消息
    @Select("select * from activity where id = #{id}")
    @Results({
            @Result(column = "activity_type",property = "activityType"),
            @Result(column = "activity_title",property = "activityTitle"),
            @Result(column = "create_time",property = "createTime")
    })
    Activity findById(Integer id);
}
