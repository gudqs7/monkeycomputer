package com.guddqs.monkeycomputer.product.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guddqs.monkeycomputer.product.biz.ProductBiz;
import com.guddqs.monkeycomputer.product.dao.ProductMapper;
import com.guddqs.monkeycomputer.product.entity.Product;
import com.guddqs.monkeycomputer.product.entity.ProductExample;

@Service
public class ProductBizImpl implements ProductBiz{
	
	@Autowired
	private ProductMapper mapper;

	@Override
	public int countByExample(ProductExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ProductExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Product record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Product record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<Product> selectByExample(ProductExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public Product selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Product record, ProductExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Product record, ProductExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Product record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Product record) {
		return mapper.updateByPrimaryKey(record);
	}
	
	
	
}
