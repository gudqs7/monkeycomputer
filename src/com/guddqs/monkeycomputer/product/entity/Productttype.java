package com.guddqs.monkeycomputer.product.entity;

public class Productttype {
    @Override
	public String toString() {
		return "Productttype [id=" + id + ", name=" + name + ", parentid=" + parentid + "]";
	}

	private Integer id;

    private String name;

    private Integer parentid;

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

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}