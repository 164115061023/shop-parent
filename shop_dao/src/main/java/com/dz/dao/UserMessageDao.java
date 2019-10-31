package com.dz.dao;

import com.dz.pojo.UserMessage;

import org.apache.ibatis.annotations.*;

public interface UserMessageDao {

    @Update("update user_message set name=#{name},sex=#{sex},tel=#{tel},email=#{email},birthday=#{birthday} " +
            "where user_login_id=#{userLoginId}")
   void updateInfo(UserMessage userMessage);

    @Select("select id,name,sex,tel,email,birthday,user_login_id as userLoginId from user_message where user_Login_Id=#{id}")
   UserMessage findByUid(Integer userLoginId);

    //查询信息显示

}
