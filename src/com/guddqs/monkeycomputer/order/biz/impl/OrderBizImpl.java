package com.guddqs.monkeycomputer.order.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guddqs.monkeycomputer.order.biz.OrderBiz;
import com.guddqs.monkeycomputer.order.dao.OrdersMapper;
import com.guddqs.monkeycomputer.order.entity.Orders;
import com.guddqs.monkeycomputer.order.entity.OrdersExample;

@Service
public class OrderBizImpl implements OrderBiz {

	@Autowired
	private OrdersMapper mapper;

	@Override
	public int countByExample(OrdersExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(OrdersExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Orders record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Orders record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<Orders> selectByExample(OrdersExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public Orders selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Orders record, OrdersExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Orders record, OrdersExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int updateByPrimaryKeySelective(Orders record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Orders record) {
		return mapper.updateByPrimaryKey(record);
	}

}
