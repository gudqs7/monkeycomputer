package com.guddqs.monkeycomputer.product.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guddqs.monkeycomputer.product.biz.ProductTypeBiz;
import com.guddqs.monkeycomputer.product.dao.ProductttypeMapper;
import com.guddqs.monkeycomputer.product.entity.Productttype;
import com.guddqs.monkeycomputer.product.entity.ProductttypeExample;

@Service
public class ProductTypeBizImpl implements ProductTypeBiz {

	@Autowired
	private ProductttypeMapper mapper;

	@Override
	public int countByExample(ProductttypeExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ProductttypeExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Productttype record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Productttype record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<Productttype> selectByExample(ProductttypeExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public Productttype selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Productttype record, ProductttypeExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Productttype record, ProductttypeExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Productttype record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Productttype record) {
		return mapper.updateByPrimaryKey(record);
	}

}
