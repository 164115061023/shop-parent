package com.dz.dao;

import com.dz.pojo.UserLogin;
import org.apache.ibatis.annotations.Select;

public interface UserLoginDao {

    @Select("select username from user_login where id=#{id}")
    UserLogin findById(Integer id);
}
