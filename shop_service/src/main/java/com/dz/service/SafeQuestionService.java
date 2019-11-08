package com.dz.service;

import com.dz.dao.SafeQuestionDao;
import com.dz.pojo.SafeQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SafeQuestionService {
    @Autowired
    private SafeQuestionDao safeQuestionDao;

    public void save(SafeQuestion safeQuestion){
        safeQuestionDao.save(safeQuestion);
    }
    //修改问题
    public  void updateQuestion(SafeQuestion safeQuestion){
        safeQuestionDao.updateQuestion(safeQuestion);
    }
    //查询答案
    public  List<SafeQuestion> findByUid(Integer userLoginId){
        return safeQuestionDao.findByUid(userLoginId);
    }
}
