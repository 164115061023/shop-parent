package com.dz.dao;


import com.dz.pojo.UserLogin;


import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserLoginDao {


    @Select("select username from user_login where id=#{id}")
    UserLogin findUserNameById(Integer id);

    //11月4号添加查询userLogin中的信息
    @Select("select id,username,password from user_login where id=#{id}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(property = "safeQuestionList",column = "id",many=@Many(select = "com.dz.dao.SafeQuestionDao.findByUid"))
    })
    UserLogin findAll(Integer id);

    @Select("select * from user_login where username=#{username}")
    UserLogin findByLoginName(String username);

    //查询旧密码
    @Select("select password from user_login where id=#{id}")
    UserLogin findPwdById(Integer id);

    //通过id修改密码han
    @Update("update user_login set password=#{password} where id=#{id}")
    void updatePassword(UserLogin userLogin);


    @Insert("insert into user_login(username,password) values(#{param1},#{param2})")
    void save(String username, String password);

}
