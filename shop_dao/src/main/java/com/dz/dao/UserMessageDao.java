package com.dz.dao;

import com.dz.pojo.UserMessage;

import org.apache.ibatis.annotations.*;

public interface UserMessageDao {

    @Update("update user_message set name=#{name},sex=#{sex},tel=#{tel},email=#{email},birthday=#{birthday} " +
            "where user_login_id in(select user_login_id from login_message where user_login_id=#{user_message_id})")
    UserMessage updateInfo(Integer userLoginId);

    @Select("select * from user_message where id in(select user_message_id from login_message where user_login_id=#{uid})")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(property = "userLogin",column = "id",one = @One(select = "com.dz.dao.UserLoginDao.findById"))
    })
   UserMessage findByUid(Integer uid);

    //查询信息显示
    @Select("select name,sex,tel,email,birthday from user_message where id=#{id} ")
    UserMessage findById(Integer id);
}
