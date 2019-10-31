package com.dz.service;

import com.dz.dao.UserLoginDao;
import com.dz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    @Autowired
    private UserLoginDao userLoginDao;

    public User findByLoginName(String username) {
        return userLoginDao.findByLoginName(username);
    }
}
