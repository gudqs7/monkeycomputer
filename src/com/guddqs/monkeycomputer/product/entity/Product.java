package com.guddqs.monkeycomputer.product.entity;

public class Product {
    private Integer id;

    private String name;

    private Double price;

    private Integer stock;

    private String picture;

    private Integer point;

    private String simpledesc;

    private String detialdesc;

    private Integer typeid;

    private Integer state;
    
    private Productttype  producttype;

    private Productpackage productpackage;
    

	public Productpackage getProductpackage() {
		return productpackage;
	}

	public void setProductpackage(Productpackage productpackage) {
		this.productpackage = productpackage;
	}

	public Productttype getProducttype() {
		return producttype;
	}

	public void setProducttype(Productttype producttype) {
		this.producttype = producttype;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getSimpledesc() {
        return simpledesc;
    }

    public void setSimpledesc(String simpledesc) {
        this.simpledesc = simpledesc == null ? null : simpledesc.trim();
    }

    public String getDetialdesc() {
        return detialdesc;
    }

    public void setDetialdesc(String detialdesc) {
        this.detialdesc = detialdesc == null ? null : detialdesc.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}