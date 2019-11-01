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
    public UserLogin findPwdById(Integer id){
        return userLoginDao.findPwdById(id);
    }
    //通过id修改登录者密码
    public void updatePwd(Integer id) {
        userLoginDao.updatePassword(id);
    }
    public void save(String username, String password) {
        userLoginDao.save(username,password);
    }
}
