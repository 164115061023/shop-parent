package com.dz.pojo;

public class BrandInfo {
    private Integer id;
    private String brandName;
    private String brandLoge;
    private String brandDesc;//品牌描述
    private String telephone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandLoge() {
        return brandLoge;
    }

    public void setBrandLoge(String brandLoge) {
        this.brandLoge = brandLoge;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
