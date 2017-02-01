package com.guddqs.monkeycomputer.order.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.order.entity.Aftersale;
import com.guddqs.monkeycomputer.order.entity.AftersaleExample;

public interface AftersaleMapper {
    int countByExample(AftersaleExample example);

    int deleteByExample(AftersaleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Aftersale record);

    int insertSelective(Aftersale record);

    List<Aftersale> selectByExample(AftersaleExample example);

    Aftersale selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Aftersale record, @Param("example") AftersaleExample example);

    int updateByExample(@Param("record") Aftersale record, @Param("example") AftersaleExample example);

    int updateByPrimaryKeySelective(Aftersale record);

    int updateByPrimaryKey(Aftersale record);
}