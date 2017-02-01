package com.guddqs.monkeycomputer.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.product.entity.Productcollection;
import com.guddqs.monkeycomputer.product.entity.ProductcollectionExample;

public interface ProductcollectionMapper {
    int countByExample(ProductcollectionExample example);

    int deleteByExample(ProductcollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Productcollection record);

    int insertSelective(Productcollection record);

    List<Productcollection> selectByExample(ProductcollectionExample example);

    Productcollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Productcollection record, @Param("example") ProductcollectionExample example);

    int updateByExample(@Param("record") Productcollection record, @Param("example") ProductcollectionExample example);

    int updateByPrimaryKeySelective(Productcollection record);

    int updateByPrimaryKey(Productcollection record);
}