package com.guddqs.monkeycomputer.order.entity;

public class Aftersale {
    private Integer id;

    private Integer orderid;

    private Integer productid;

    private Integer type;

    private Double refundprice;

    private String copy;

    private Integer state;

    private Integer logisticid;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getRefundprice() {
        return refundprice;
    }

    public void setRefundprice(Double refundprice) {
        this.refundprice = refundprice;
    }

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy == null ? null : copy.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getLogisticid() {
        return logisticid;
    }

    public void setLogisticid(Integer logisticid) {
        this.logisticid = logisticid;
    }
}