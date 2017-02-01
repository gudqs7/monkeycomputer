package com.guddqs.monkeycomputer.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.other.entity.Advice;
import com.guddqs.monkeycomputer.other.entity.AdviceExample;

public interface AdviceMapper {
    int countByExample(AdviceExample example);

    int deleteByExample(AdviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Advice record);

    int insertSelective(Advice record);

    List<Advice> selectByExample(AdviceExample example);

    Advice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Advice record, @Param("example") AdviceExample example);

    int updateByExample(@Param("record") Advice record, @Param("example") AdviceExample example);

    int updateByPrimaryKeySelective(Advice record);

    int updateByPrimaryKey(Advice record);
}