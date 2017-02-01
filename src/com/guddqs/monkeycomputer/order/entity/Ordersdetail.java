package com.guddqs.monkeycomputer.order.entity;

public class Ordersdetail {
    private Integer id;

    private Integer orderid;

    private Integer productid;

    private Integer num;

    private Integer productpackageid;
    
    public Ordersdetail(Integer orderid, Integer productid, Integer num, Integer productpackageid) {
		super();
		this.orderid = orderid;
		this.productid = productid;
		this.num = num;
		this.productpackageid = productpackageid;
	}

	public Ordersdetail() {
		super();
		// TODO Auto-generated constructor stub
	}

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

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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