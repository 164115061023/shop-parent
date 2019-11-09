package com.dz.dao;

import com.dz.pojo.UserMessage;

import org.apache.ibatis.annotations.*;

public interface UserMessageDao {

    @Update("update user_message set name=#{name},sex=#{sex},tel=#{tel},email=#{email}" +
            "where user_login_id=#{userLoginId}")
   void updateInfo(UserMessage userMessage);
    //修改手机号
    @Update("update user_message set tel=#{tel}")
    void updateTel(String tel);
    @Select("select id,name,sex,tel,email,birthday,user_login_id as userLoginId from user_message where user_Login_Id=#{id}")
   UserMessage findByUid(Integer userLoginId);

    //支付密码
    @Update("update user_message set paypassword=#{paypassword} where user_login_id=#{userLoginId}")
    void updatepaypwd(UserMessage userMessage);

    @Update("update user_message set birthday=#{birthday}")
    void updateBirthday(String birthday);
    //实名认证修改身份证
    @Update("update user_message set idcard=#{idcard}")
    void updateIdCard(String idcard);
    //修改邮箱
    @Update("update user_message set email=#{email}")
    void updateEmail(String email);
}
