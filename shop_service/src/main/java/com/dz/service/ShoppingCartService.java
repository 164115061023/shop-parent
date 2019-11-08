package com.dz.service;

import com.dz.dao.ShoppingCartDao;
import com.dz.pojo.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    private ShoppingCartDao shoppingCartDao;

    public int queryNum(Integer id) {
        return shoppingCartDao.queryNum(id);
    }

    public List<ShoppingCart> findAllByUserLoginId(Integer userLoginId) {
        return shoppingCartDao.findAllByUserLoginId(userLoginId);
    }
}
