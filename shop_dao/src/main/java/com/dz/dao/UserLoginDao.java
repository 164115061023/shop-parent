package com.dz.dao;


import com.dz.pojo.UserLogin;



import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserLoginDao {


    @Select("select username from user_login where id=#{id}")
    UserLogin findUserNameById(Integer id);

    //11月4号添加查询userLogin中的信息
    @Select("select id,username,password from user_login where id=#{id}")
    UserLogin findAll(Integer id);

    @Select("select * from user_login where username=#{username}")
    UserLogin findByLoginName(String username);


    //查询旧密码
    @Select("select password from user_login where id=#{id}")
    UserLogin findPwdById(Integer id);

    //通过id修改密码
    @Update("update user_login set password=#{password} where id=#{id}")
    void updatePassword(UserLogin userLogin);


    @Insert("insert into user_login(username,password) values(#{param1},#{param2})")
    void save(String username, String password);

}
