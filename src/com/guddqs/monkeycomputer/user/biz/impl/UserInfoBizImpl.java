package com.guddqs.monkeycomputer.user.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guddqs.monkeycomputer.user.biz.UserInfoBiz;
import com.guddqs.monkeycomputer.user.dao.UserinfoMapper;
import com.guddqs.monkeycomputer.user.entity.Userinfo;
import com.guddqs.monkeycomputer.user.entity.UserinfoExample;

@Service
public class UserInfoBizImpl implements UserInfoBiz {

	@Autowired
	private UserinfoMapper userinfoMapper;

	public void setUserinfoMapper(UserinfoMapper userinfoMapper) {
		this.userinfoMapper = userinfoMapper;
	}

	@Override
	public int countByExample(UserinfoExample example) {
		return userinfoMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UserinfoExample example) {
		return userinfoMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return userinfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Userinfo record) {
		return userinfoMapper.insert(record);
	}

	@Override
	public int insertSelective(Userinfo record) {
		return userinfoMapper.insertSelective(record);
	}

	@Override
	public List<Userinfo> selectByExample(UserinfoExample example) {
		return userinfoMapper.selectByExample(example);
	}

	@Override
	public Userinfo selectByPrimaryKey(Integer id) {
		return userinfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Userinfo record, UserinfoExample example) {
		return userinfoMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Userinfo record, UserinfoExample example) {
		return userinfoMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Userinfo record) {
		return userinfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Userinfo record) {
		return userinfoMapper.updateByPrimaryKey(record);
	}

}
