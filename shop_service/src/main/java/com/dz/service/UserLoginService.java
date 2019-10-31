package com.dz.service;

import com.dz.dao.UserLoginDao;
<<<<<<< HEAD

import com.dz.pojo.UserLogin;

import com.dz.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    @Autowired
    private UserLoginDao userLoginDao;


    public UserLogin findUserNameById(Integer id){
        return userLoginDao.findById(id);

    public User findByLoginName(String username) {
        return userLoginDao.findByLoginName(username);

    }
}
