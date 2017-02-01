package com.guddqs.monkeycomputer.product.entity;

import java.util.Date;

public class Historyrecord {
    private Integer id;

    private Integer productid;

    private Date looktime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Date getLooktime() {
        return looktime;
    }

    public void setLooktime(Date looktime) {
        this.looktime = looktime;
    }
}