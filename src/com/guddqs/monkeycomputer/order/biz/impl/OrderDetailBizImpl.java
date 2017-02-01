package com.guddqs.monkeycomputer.order.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guddqs.monkeycomputer.order.biz.OrderDetailBiz;
import com.guddqs.monkeycomputer.order.dao.OrdersdetailMapper;
import com.guddqs.monkeycomputer.order.entity.Ordersdetail;
import com.guddqs.monkeycomputer.order.entity.OrdersdetailExample;

@Service
public class OrderDetailBizImpl implements OrderDetailBiz {

	@Autowired
	private OrdersdetailMapper mapper;

	@Override
	public int countByExample(OrdersdetailExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(OrdersdetailExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Ordersdetail record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Ordersdetail record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<Ordersdetail> selectByExample(OrdersdetailExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public Ordersdetail selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Ordersdetail record, OrdersdetailExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Ordersdetail record, OrdersdetailExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int updateByPrimaryKeySelective(Ordersdetail record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Ordersdetail record) {
		return mapper.updateByPrimaryKey(record);
	}

}
