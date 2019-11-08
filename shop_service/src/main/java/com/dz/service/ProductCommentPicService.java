package com.dz.service;

import com.dz.dao.ProductCommentPicDao;
import com.dz.pojo.ProductCommentPic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCommentPicService {
    @Autowired
    private ProductCommentPicDao productCommentPicDao;

    //通过评价id找照片
    public List<ProductCommentPic> findByProductCommentId(Integer productCommentId){
        return productCommentPicDao.findByProductCommentId(productCommentId);
    }
}
