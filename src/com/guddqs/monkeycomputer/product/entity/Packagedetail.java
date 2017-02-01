package com.guddqs.monkeycomputer.product.entity;

public class Packagedetail {
    @Override
	public String toString() {
		return "Packagedetail [id=" + id + ", packageid=" + packageid + ", name=" + name + ", price=" + price + "]";
	}

	private Integer id;

    private Integer packageid;

    private String name;

    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPackageid() {
        return packageid;
    }

    public void setPackageid(Integer packageid) {
        this.packageid = packageid;
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
}