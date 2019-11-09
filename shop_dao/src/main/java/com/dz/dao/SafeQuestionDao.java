package com.dz.dao;

import com.dz.pojo.SafeQuestion;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SafeQuestionDao {
    //设置安全问题--存入问题
    @Insert("insert into safe_question(question,answer) values(#{question},#{answer})")
    void save(SafeQuestion safeQuestion);
    //查询答案
    @Select("select answer,user_login_id as userLoginId from safe_question where user_Login_id=#{userLoginId}")
    List<SafeQuestion> findByUid(Integer userLoginId);

    //修改答案
    @Update("update safe_question set answer=#{answer} where user_login_id=#{userLoginId}")
    void updateQuestion(SafeQuestion safeQuestion);
}
