package com.guddqs.monkeycomputer.user.entity;

import java.util.List;

public class Useraddress {
    private Integer id;

    private Integer userid;

    private Integer defaultid;
    
    private List<Addressdetail> addressdetails;

    public List<Addressdetail> getAddressdetails() {
		return addressdetails;
	}

	public void setAddressdetails(List<Addressdetail> addressdetails) {
		this.addressdetails = addressdetails;
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

    public Integer getDefaultid() {
        return defaultid;
    }

    public void setDefaultid(Integer defaultid) {
        this.defaultid = defaultid;
    }
}