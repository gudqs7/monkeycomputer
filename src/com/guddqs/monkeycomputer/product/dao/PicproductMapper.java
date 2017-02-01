package com.guddqs.monkeycomputer.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.product.entity.Picproduct;
import com.guddqs.monkeycomputer.product.entity.PicproductExample;

public interface PicproductMapper {
    int countByExample(PicproductExample example);

    int deleteByExample(PicproductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Picproduct record);

    int insertSelective(Picproduct record);

    List<Picproduct> selectByExample(PicproductExample example);

    Picproduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Picproduct record, @Param("example") PicproductExample example);

    int updateByExample(@Param("record") Picproduct record, @Param("example") PicproductExample example);

    int updateByPrimaryKeySelective(Picproduct record);

    int updateByPrimaryKey(Picproduct record);
}