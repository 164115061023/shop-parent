package com.dz.service;

import com.dz.dao.ProductDao;
import com.dz.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    //通过id查找商品
    public Product findById(Integer id){
        return productDao.findById(id);
    }
    //通过id查找
    public Product findAll(Integer id){
        return productDao.findAll(id);
    }

}

