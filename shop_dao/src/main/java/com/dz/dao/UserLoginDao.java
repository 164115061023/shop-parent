package com.dz.dao;


import com.dz.pojo.UserLogin;



import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserLoginDao {


    @Select("select username from user_login where id=#{id}")
    UserLogin findUserNameById(Integer id);


    @Select("select * from user_login where username=#{username}")
    UserLogin findByLoginName(String username);

    @Insert("insert into user_login(username,password) values(#{param1},#{param2})")
    void save(String username, String password);
}
