package com.guddqs.monkeycomputer.user.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guddqs.monkeycomputer.user.biz.LoginBiz;
import com.guddqs.monkeycomputer.user.dao.LoginMapper;
import com.guddqs.monkeycomputer.user.entity.Login;
import com.guddqs.monkeycomputer.user.entity.LoginExample;

@Service
public class LoginBizImpl implements LoginBiz{

	@Autowired
	private LoginMapper loginMapper;
	
	public void setLoginMapper(LoginMapper loginMapper) {
		this.loginMapper = loginMapper;
	}

	@Override
	public int countByExample(LoginExample example) {
		return loginMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(LoginExample example) {
		return loginMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer loginid) {
		return loginMapper.deleteByPrimaryKey(loginid);
	}

	@Override
	public int insert(Login record) {
		return loginMapper.insert(record);
	}

	@Override
	public int insertSelective(Login record) {
		return loginMapper.insertSelective(record);
	}

	@Override
	public List<Login> selectByExample(LoginExample example) {
		return loginMapper.selectByExample(example);
	}

	@Override
	public Login selectByPrimaryKey(Integer loginid) {
		return loginMapper.selectByPrimaryKey(loginid);
	}

	@Override
	public int updateByExampleSelective(Login record, LoginExample example) {
		return loginMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Login record, LoginExample example) {
		return loginMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Login record) {
		return loginMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Login record) {
		return loginMapper.updateByPrimaryKey(record);
	}
	
	
	
}
