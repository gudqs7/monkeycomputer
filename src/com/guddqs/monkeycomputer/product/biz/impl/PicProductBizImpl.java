package com.guddqs.monkeycomputer.product.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guddqs.monkeycomputer.product.biz.PicProductBiz;
import com.guddqs.monkeycomputer.product.dao.PicproductMapper;
import com.guddqs.monkeycomputer.product.entity.Picproduct;
import com.guddqs.monkeycomputer.product.entity.PicproductExample;

@Service
public class PicProductBizImpl implements PicProductBiz {

	@Autowired
	private PicproductMapper mapper;

	@Override
	public int countByExample(PicproductExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(PicproductExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Picproduct record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Picproduct record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<Picproduct> selectByExample(PicproductExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public Picproduct selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Picproduct record, PicproductExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Picproduct record, PicproductExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Picproduct record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Picproduct record) {
		return mapper.updateByPrimaryKey(record);
	}

}
