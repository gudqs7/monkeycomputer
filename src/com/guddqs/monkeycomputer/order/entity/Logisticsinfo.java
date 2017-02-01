package com.guddqs.monkeycomputer.order.entity;

public class Logisticsinfo {
    private Integer id;

    private String no;

    private Double logisticprice;

    private String logisticbrand;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public Double getLogisticprice() {
        return logisticprice;
    }

    public void setLogisticprice(Double logisticprice) {
        this.logisticprice = logisticprice;
    }

    public String getLogisticbrand() {
        return logisticbrand;
    }

    public void setLogisticbrand(String logisticbrand) {
        this.logisticbrand = logisticbrand == null ? null : logisticbrand.trim();
    }
}