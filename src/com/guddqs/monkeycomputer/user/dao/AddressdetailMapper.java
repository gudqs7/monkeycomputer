package com.guddqs.monkeycomputer.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.guddqs.monkeycomputer.user.entity.Addressdetail;
import com.guddqs.monkeycomputer.user.entity.AddressdetailExample;

public interface AddressdetailMapper {
	int countByExample(AddressdetailExample example);

	int deleteByExample(AddressdetailExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Addressdetail record);

	int insertSelective(Addressdetail record);

	List<Addressdetail> selectByExample(AddressdetailExample example);

	Addressdetail selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Addressdetail record, @Param("example") AddressdetailExample example);

	int updateByExample(@Param("record") Addressdetail record, @Param("example") AddressdetailExample example);

	int updateByPrimaryKeySelective(Addressdetail record);

	int updateByPrimaryKey(Addressdetail record);
}