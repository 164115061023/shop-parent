package com.dz.dao;

import com.dz.pojo.Product;
import org.apache.ibatis.annotations.Select;

public interface ProductDao {

    //通过id找商品
    @Select("select id,product_pack productPack,product_name productName,type_id typeId,supplier_id supplierId" +
            "price,publish_status publishStatus,weight,length,height,width,color_type colorType,production_date productionDate" +
            "shelf_life shelfLife,descript,brand_id brandId,stock,product_type_id productTypeId from product where id = #{id}")
    Product findById(Integer id);
    //通过id 查找商品信息
    @Select("SELECT id,product_name as productName,price,size,color,pack from product where id = #{id}")
    Product findAll(Integer id);



}
