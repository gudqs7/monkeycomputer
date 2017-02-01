package com.guddqs.monkeycomputer.order.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cart implements Serializable{

	private Integer id;

    private Integer userid;

    private Integer productid;

    private Integer num;

    private Integer productpackageid;
    
    public Integer getProductpackageid() {
		return productpackageid;
	}

	public void setProductpackageid(Integer productpackageid) {
		this.productpackageid = productpackageid;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}