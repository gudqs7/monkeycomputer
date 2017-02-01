package com.guddqs.monkeycomputer.order.entity;

public class Evaluation {
    private Integer id;

    private Integer orderid;

    private String description;

    private String pics;

    private Integer productlevel;

    private Integer sendlevel;

    private Integer logisticslevel;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    public Integer getProductlevel() {
        return productlevel;
    }

    public void setProductlevel(Integer productlevel) {
        this.productlevel = productlevel;
    }

    public Integer getSendlevel() {
        return sendlevel;
    }

    public void setSendlevel(Integer sendlevel) {
        this.sendlevel = sendlevel;
    }

    public Integer getLogisticslevel() {
        return logisticslevel;
    }

    public void setLogisticslevel(Integer logisticslevel) {
        this.logisticslevel = logisticslevel;
    }
}