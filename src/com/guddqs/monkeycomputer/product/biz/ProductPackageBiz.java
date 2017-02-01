package com.guddqs.monkeycomputer.product.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.product.entity.Productpackage;
import com.guddqs.monkeycomputer.product.entity.ProductpackageExample;

public interface ProductPackageBiz {
	 int countByExample(ProductpackageExample example);

	    int deleteByExample(ProductpackageExample example);

	    int deleteByPrimaryKey(Integer id);

	    int insert(Productpackage record);

	    int insertSelective(Productpackage record);

	    List<Productpackage> selectByExample(ProductpackageExample example);

	    Productpackage selectByPrimaryKey(Integer id);

	    int updateByExampleSelective(@Param("record") Productpackage record, @Param("example") ProductpackageExample example);

	    int updateByExample(@Param("record") Productpackage record, @Param("example") ProductpackageExample example);

	    int updateByPrimaryKeySelective(Productpackage record);

	    int updateByPrimaryKey(Productpackage record);
}
