package com.dz.dao;

import com.dz.pojo.SafeQuestion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface SafeQuestionDao {
    //设置安全问题--存入问题
    @Insert("insert into safe_question(question,answer) values(#{question},#{answer})")
    void save(SafeQuestion safeQuestion);

    @Select("select id,question,answer,user_login_id as userLoginId from safe_question where user_login_id=#{id}")
    SafeQuestion findByUserId(Integer userLoginId);
}
