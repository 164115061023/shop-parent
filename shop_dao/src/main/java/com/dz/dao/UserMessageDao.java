package com.dz.dao;

import com.dz.pojo.UserMessage;
import org.apache.ibatis.annotations.Update;

public interface UserMessageDao {

    @Update("update user_message set name=#{name},sex=#{sex},age=#{age},tel=#{tel},email=#{email},card_type=#{card_type}," +
            "cardno=#{cardno},birthday=#{birthday},user_level=#{user_level},user_login_id=#{user_login_id}")

    UserMessage updateInfo(Integer userLoginId);
}
