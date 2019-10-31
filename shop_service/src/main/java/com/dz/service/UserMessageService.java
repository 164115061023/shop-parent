package com.dz.service;

import com.dz.dao.UserMessageDao;
import com.dz.pojo.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMessageService {

    @Autowired
    private UserMessageDao userMessageDao;

    public UserMessage changeInfoById(Integer userLoginId){
        return userMessageDao.updateInfo(userLoginId);
    }
    public void findByUid(Integer uid){
        userMessageDao.findByUid(uid);
    }
    public void findById(Integer id){
        userMessageDao.findById(id);
    }
}
