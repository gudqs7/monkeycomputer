package com.guddqs.monkeycomputer.user.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.user.entity.Login;
import com.guddqs.monkeycomputer.user.entity.LoginExample;

public interface LoginBiz {
	int countByExample(LoginExample example);

	int deleteByExample(LoginExample example);

	int deleteByPrimaryKey(Integer loginid);

	int insert(Login record);

	int insertSelective(Login record);

	List<Login> selectByExample(LoginExample example);

	Login selectByPrimaryKey(Integer loginid);

	int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginExample example);

	int updateByExample(@Param("record") Login record, @Param("example") LoginExample example);

	int updateByPrimaryKeySelective(Login record);

	int updateByPrimaryKey(Login record);
}
