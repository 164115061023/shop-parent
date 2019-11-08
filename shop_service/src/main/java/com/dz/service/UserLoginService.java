package com.dz.service;

import com.dz.dao.UserLoginDao;


import com.dz.pojo.UserLogin;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public UserLogin findPwdById(Integer id){
        return userLoginDao.findPwdById(id);
    }
    //通过id修改登录者密码
    public void updatePwd(UserLogin userLogin) {
        userLoginDao.updatePassword(userLogin);
    }
    public void save(String username, String password) {
        userLoginDao.save(username,password);
    }
    public UserLogin findAll(Integer id){
        return userLoginDao.findAll(id);
    }
}
