package com.dz.service;

import com.dz.dao.ProductCommentDao;
import com.dz.pojo.ProductComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCommentService {

    @Autowired
    private ProductCommentDao productCommentDao;

    //通过UserLoginID查找评论
    public List<ProductComment> findByUserId(Integer userId){
        return productCommentDao.findByUserId(userId);
    }



}
