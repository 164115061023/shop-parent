package com.dz.service;

import com.dz.dao.ProductDao;
import com.dz.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    //通过id查找商品
    public Product findById(Integer id){
        return productDao.findById(id);
    }

    //查找权限是今日推荐的商品

    public List<Product> findByRecommend() {
        return productDao.findByRecommend();
    }
}

