package com.dz.service;

import com.dz.dao.UserMessageDao;
import com.dz.pojo.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMessageService {

    @Autowired
    private UserMessageDao userMessageDao;

   public void updateInfo(UserMessage userMessage){
       userMessageDao.updateInfo(userMessage);
   }

    public UserMessage findByUid(Integer uid){
        return userMessageDao.findByUid(uid);
    }
    public void updatepaypwd(UserMessage userMessage){
       userMessageDao.updatepaypwd(userMessage);
    }


    public void updateBirthday(String birthday) {
       userMessageDao.updateBirthday(birthday);
    }
}
