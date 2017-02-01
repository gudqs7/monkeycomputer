package com.guddqs.monkeycomputer.order.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.order.entity.Logisticsinfo;
import com.guddqs.monkeycomputer.order.entity.LogisticsinfoExample;

public interface LogisticsinfoMapper {
    int countByExample(LogisticsinfoExample example);

    int deleteByExample(LogisticsinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Logisticsinfo record);

    int insertSelective(Logisticsinfo record);

    List<Logisticsinfo> selectByExample(LogisticsinfoExample example);

    Logisticsinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Logisticsinfo record, @Param("example") LogisticsinfoExample example);

    int updateByExample(@Param("record") Logisticsinfo record, @Param("example") LogisticsinfoExample example);

    int updateByPrimaryKeySelective(Logisticsinfo record);

    int updateByPrimaryKey(Logisticsinfo record);
}