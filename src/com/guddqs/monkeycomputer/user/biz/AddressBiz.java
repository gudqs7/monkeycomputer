package com.guddqs.monkeycomputer.user.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.user.entity.Useraddress;
import com.guddqs.monkeycomputer.user.entity.UseraddressExample;

public interface AddressBiz {
	int countByExample(UseraddressExample example);

    int deleteByExample(UseraddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Useraddress record);

    int insertSelective(Useraddress record);

    List<Useraddress> selectByExample(UseraddressExample example);

    Useraddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Useraddress record, @Param("example") UseraddressExample example);

    int updateByExample(@Param("record") Useraddress record, @Param("example") UseraddressExample example);

    int updateByPrimaryKeySelective(Useraddress record);

    int updateByPrimaryKey(Useraddress record);
}
