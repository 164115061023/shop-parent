package com.dz.service;

import com.dz.dao.ShoppingCartDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCardService {

    @Autowired
    private ShoppingCartDao shoppingCardDao;
}
