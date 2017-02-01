package com.guddqs.monkeycomputer.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.other.entity.Computerknowledge;
import com.guddqs.monkeycomputer.other.entity.ComputerknowledgeExample;

public interface ComputerknowledgeMapper {
    int countByExample(ComputerknowledgeExample example);

    int deleteByExample(ComputerknowledgeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Computerknowledge record);

    int insertSelective(Computerknowledge record);

    List<Computerknowledge> selectByExample(ComputerknowledgeExample example);

    Computerknowledge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Computerknowledge record, @Param("example") ComputerknowledgeExample example);

    int updateByExample(@Param("record") Computerknowledge record, @Param("example") ComputerknowledgeExample example);

    int updateByPrimaryKeySelective(Computerknowledge record);

    int updateByPrimaryKey(Computerknowledge record);
}