package com.guddqs.monkeycomputer.order.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guddqs.monkeycomputer.order.biz.CartBiz;
import com.guddqs.monkeycomputer.order.dao.CartMapper;
import com.guddqs.monkeycomputer.order.entity.Cart;
import com.guddqs.monkeycomputer.order.entity.CartExample;

@Service
public class CartBizImpl implements CartBiz {

	@Autowired
	private CartMapper mapper;

	@Override
	public int countByExample(CartExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CartExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Cart record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Cart record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<Cart> selectByExample(CartExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public Cart selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Cart record, CartExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Cart record, CartExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Cart record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Cart record) {
		return mapper.updateByPrimaryKey(record);
	}

}
