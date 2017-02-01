package com.guddqs.monkeycomputer.product.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guddqs.monkeycomputer.product.biz.ProductPackageBiz;
import com.guddqs.monkeycomputer.product.dao.ProductpackageMapper;
import com.guddqs.monkeycomputer.product.entity.Productpackage;
import com.guddqs.monkeycomputer.product.entity.ProductpackageExample;

@Service
public class ProductPackageBizImpl implements ProductPackageBiz {

	@Autowired
	private ProductpackageMapper mapper;

	@Override
	public int countByExample(ProductpackageExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ProductpackageExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Productpackage record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Productpackage record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<Productpackage> selectByExample(ProductpackageExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public Productpackage selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Productpackage record, ProductpackageExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Productpackage record, ProductpackageExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Productpackage record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Productpackage record) {
		return mapper.updateByPrimaryKey(record);
	}

}
