package com.guddqs.monkeycomputer.user.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guddqs.monkeycomputer.user.biz.AddressDetailBiz;
import com.guddqs.monkeycomputer.user.dao.AddressdetailMapper;
import com.guddqs.monkeycomputer.user.entity.Addressdetail;
import com.guddqs.monkeycomputer.user.entity.AddressdetailExample;

@Service
public class AddressDetailBizImpl implements AddressDetailBiz {

	@Autowired
	private AddressdetailMapper addressdetailMapper;

	@Override
	public int countByExample(AddressdetailExample example) {
		return addressdetailMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(AddressdetailExample example) {
		return addressdetailMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return addressdetailMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Addressdetail record) {
		return addressdetailMapper.insert(record);
	}

	@Override
	public int insertSelective(Addressdetail record) {
		return addressdetailMapper.insertSelective(record);
	}

	@Override
	public List<Addressdetail> selectByExample(AddressdetailExample example) {
		return addressdetailMapper.selectByExample(example);
	}

	@Override
	public Addressdetail selectByPrimaryKey(Integer id) {
		return addressdetailMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Addressdetail record, AddressdetailExample example) {
		return addressdetailMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Addressdetail record, AddressdetailExample example) {
		return addressdetailMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Addressdetail record) {
		return addressdetailMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Addressdetail record) {
		return addressdetailMapper.updateByPrimaryKey(record);
	}

}
