package com.dz.service;

import com.dz.dao.SafeQuestionDao;
import com.dz.pojo.SafeQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SafeQuestionService {
    @Autowired
    private SafeQuestionDao safeQuestionDao;

    public void save(SafeQuestion safeQuestion){
        safeQuestionDao.save(safeQuestion);
    }
    //查找user_login_id
    public  SafeQuestion findByUserId(Integer userLoginId){
        return safeQuestionDao.findByUserId(userLoginId);
    }

}
