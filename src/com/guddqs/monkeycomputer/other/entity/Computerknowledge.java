package com.guddqs.monkeycomputer.other.entity;

public class Computerknowledge {
    private Integer id;

    private String title;

    private String detail;

    private Integer needful;

    private Integer badful;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Integer getNeedful() {
        return needful;
    }

    public void setNeedful(Integer needful) {
        this.needful = needful;
    }

    public Integer getBadful() {
        return badful;
    }

    public void setBadful(Integer badful) {
        this.badful = badful;
    }
}