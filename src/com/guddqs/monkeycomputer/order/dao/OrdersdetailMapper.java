package com.guddqs.monkeycomputer.order.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.order.entity.Ordersdetail;
import com.guddqs.monkeycomputer.order.entity.OrdersdetailExample;

public interface OrdersdetailMapper {
    int countByExample(OrdersdetailExample example);

    int deleteByExample(OrdersdetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ordersdetail record);

    int insertSelective(Ordersdetail record);

    List<Ordersdetail> selectByExample(OrdersdetailExample example);

    Ordersdetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ordersdetail record, @Param("example") OrdersdetailExample example);

    int updateByExample(@Param("record") Ordersdetail record, @Param("example") OrdersdetailExample example);

    int updateByPrimaryKeySelective(Ordersdetail record);

    int updateByPrimaryKey(Ordersdetail record);
}