package com.dz.dao;


import com.dz.pojo.UserLogin;

import com.dz.pojo.User;


import org.apache.ibatis.annotations.Select;

public interface UserLoginDao {


    @Select("select username from user_login where id=#{id}")
    UserLogin findUserNameById(Integer id);


    @Select("select * from user_login where username=#{username}")
    UserLogin findByLoginName(String username);

}
