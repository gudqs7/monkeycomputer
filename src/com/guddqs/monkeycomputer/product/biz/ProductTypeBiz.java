package com.guddqs.monkeycomputer.product.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.product.entity.Productttype;
import com.guddqs.monkeycomputer.product.entity.ProductttypeExample;

public interface ProductTypeBiz {
	int countByExample(ProductttypeExample example);

    int deleteByExample(ProductttypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Productttype record);

    int insertSelective(Productttype record);

    List<Productttype> selectByExample(ProductttypeExample example);

    Productttype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Productttype record, @Param("example") ProductttypeExample example);

    int updateByExample(@Param("record") Productttype record, @Param("example") ProductttypeExample example);

    int updateByPrimaryKeySelective(Productttype record);

    int updateByPrimaryKey(Productttype record);
}
