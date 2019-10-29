package com.dz.service;

import com.dz.dao.UserDao;
import com.dz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public User findByLoginName(String loginName){
        return userDao.findByLoginName(loginName);
    }
}
