package com.dz.service;

import com.dz.dao.UserLoginDao;


import com.dz.pojo.UserLogin;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    @Autowired
    private UserLoginDao userLoginDao;

    public UserLogin findUserNameById(Integer id) {
        return userLoginDao.findUserNameById(id);
    }

    public UserLogin findByLoginName(String username) {

        return userLoginDao.findByLoginName(username);

    }
}
