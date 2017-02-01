package com.guddqs.monkeycomputer.other.entity;

import java.util.Date;

public class Message {
    private Integer id;

    private Integer userid;

    private Short type;

    private String title;

    private String description;

    private Date createtiime;

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

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreatetiime() {
        return createtiime;
    }

    public void setCreatetiime(Date createtiime) {
        this.createtiime = createtiime;
    }
}