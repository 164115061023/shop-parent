package com.dz.service;

import com.dz.dao.ProductPicDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductPicService {

    @Autowired
    private ProductPicDao productPicDao;

}
