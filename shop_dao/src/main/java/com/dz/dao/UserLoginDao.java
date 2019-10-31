package com.dz.dao;

import com.dz.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserLoginDao {

    @Select("select * from user_login where username=#{username}")
    User findByLoginName(String username);
}
