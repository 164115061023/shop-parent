package com.dz.dao;

import com.dz.pojo.UserMessage;

import org.apache.ibatis.annotations.*;

public interface UserMessageDao {

    @Update("update user_message set name=#{name},sex=#{sex},tel=#{tel},email=#{email}" +
            "where user_login_id=#{userLoginId}")
   void updateInfo(UserMessage userMessage);

    @Select("select id,name,sex,tel,email,birthday,user_login_id as userLoginId from user_message where user_Login_Id=#{id}")
   UserMessage findByUid(Integer userLoginId);

    //支付密码
    @Update("update user_message set paypassword=#{paypassword} where user_login_id=#{userLoginId}")
    void updatepaypwd(UserMessage userMessage);

    @Update("update user_message set birthday=#{birthday}")
    void updateBirthday(String birthday);
}
