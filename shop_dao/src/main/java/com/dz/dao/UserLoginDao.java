package com.dz.dao;

import com.dz.pojo.UserLogin;
import org.apache.ibatis.annotations.Select;

public interface UserLoginDao {

    @Select("select * from user_login where username=#{username}")
    UserLogin findByLoginName(String username);
}
