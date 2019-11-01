package com.dz.dao;


import com.dz.pojo.UserLogin;

import com.dz.pojo.User;


import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserLoginDao {


    @Select("select username from user_login where id=#{id}")
    UserLogin findUserNameById(Integer id);


    @Select("select * from user_login where username=#{username}")
    UserLogin findByLoginName(String username);

    //查询旧密码
    @Select("select password from user_login where id=#{id}")
    UserLogin findPwdById(Integer id);
    //通过id修改密码
    @Update("update user_login set password=#{password} where id=#{id}")
    void updatePassword(Integer id);

}
