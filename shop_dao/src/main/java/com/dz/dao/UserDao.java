package com.dz.dao;

import com.dz.pojo.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

    @Select("select * from user_login where username=#{username}")
    User findByLoginName(String loginName);
}
