package com.dz.service;

import com.dz.dao.UserLevelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLevelService {

    @Autowired
    private UserLevelDao userLevelDao;
}
