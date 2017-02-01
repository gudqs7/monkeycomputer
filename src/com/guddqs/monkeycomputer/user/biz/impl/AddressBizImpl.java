package com.guddqs.monkeycomputer.user.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guddqs.monkeycomputer.user.biz.AddressBiz;
import com.guddqs.monkeycomputer.user.dao.UseraddressMapper;
import com.guddqs.monkeycomputer.user.entity.Useraddress;
import com.guddqs.monkeycomputer.user.entity.UseraddressExample;

@Service
public class AddressBizImpl implements AddressBiz {

	@Autowired
	private UseraddressMapper useraddressMapper;

	public void setUseraddressMapper(UseraddressMapper useraddressMapper) {
		this.useraddressMapper = useraddressMapper;
	}

	@Override
	public int countByExample(UseraddressExample example) {
		return useraddressMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UseraddressExample example) {
		return useraddressMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return useraddressMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Useraddress record) {
		return useraddressMapper.insert(record);
	}

	@Override
	public int insertSelective(Useraddress record) {
		return useraddressMapper.insertSelective(record);
	}

	@Override
	public List<Useraddress> selectByExample(UseraddressExample example) {
		return useraddressMapper.selectByExample(example);
	}

	@Override
	public Useraddress selectByPrimaryKey(Integer id) {
		return useraddressMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Useraddress record, UseraddressExample example) {
		return useraddressMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Useraddress record, UseraddressExample example) {
		return useraddressMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Useraddress record) {
		return useraddressMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Useraddress record) {
		return useraddressMapper.updateByPrimaryKey(record);
	}

}
