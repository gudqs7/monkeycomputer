package com.guddqs.monkeycomputer.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.product.entity.Historyrecord;
import com.guddqs.monkeycomputer.product.entity.HistoryrecordExample;

public interface HistoryrecordMapper {
    int countByExample(HistoryrecordExample example);

    int deleteByExample(HistoryrecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Historyrecord record);

    int insertSelective(Historyrecord record);

    List<Historyrecord> selectByExample(HistoryrecordExample example);

    Historyrecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Historyrecord record, @Param("example") HistoryrecordExample example);

    int updateByExample(@Param("record") Historyrecord record, @Param("example") HistoryrecordExample example);

    int updateByPrimaryKeySelective(Historyrecord record);

    int updateByPrimaryKey(Historyrecord record);
}