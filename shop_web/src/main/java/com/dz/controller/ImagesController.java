package com.dz.controller;

import com.dz.pojo.Product;
import com.dz.service.ImageService;
import com.dz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

@Controller
@RequestMapping("/images")
public class ImagesController {
    @Autowired
    private ImageService imageService;

    @Autowired
    private ProductService productService;

    @RequestMapping("/view")
    @ResponseBody
    public void view(HttpServletRequest request, HttpServletResponse response) throws IOException {


        String path = request.getParameter("path");

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());


        byte[] bytes = new byte[1024];

        int len=-1;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.flush();
        bos.close();


    }

}
