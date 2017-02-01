package com.guddqs.monkeycomputer.product.entity;

import java.util.List;

public class Productpackage {
    private Integer id;

    @Override
	public String toString() {
		return "Productpackage [id=" + id + ", productid=" + productid + ", defaultid=" + defaultid + "]";
	}

	private Integer productid;

    private Integer defaultid;

    private List<Packagedetail> packagedetails;
    
    public List<Packagedetail> getPackagedetails() {
		return packagedetails;
	}

	public void setPackagedetails(List<Packagedetail> packagedetails) {
		this.packagedetails = packagedetails;
	}

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

    public Integer getDefaultid() {
        return defaultid;
    }

    public void setDefaultid(Integer defaultid) {
        this.defaultid = defaultid;
    }
}