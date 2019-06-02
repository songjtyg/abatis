package org.sjt.mybatis.demo.model;

import org.sjt.mybatis.annotation.Column;

import java.math.BigInteger;

/**
 * PoiPO model
 * Created by songjiangtao
 */
public class PoiPO {

    @Column//represent id attribute match id filed in database
    private BigInteger id;
    @Column(name = "poi_name")//represent name attribute match poi_name filed in database
    private String name;
    @Column(name = "poi_brand")
    private String brand;

    @Column
    private String address;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
