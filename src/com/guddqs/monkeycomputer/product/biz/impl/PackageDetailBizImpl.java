package com.guddqs.monkeycomputer.product.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guddqs.monkeycomputer.product.biz.PackageDetailBiz;
import com.guddqs.monkeycomputer.product.dao.PackagedetailMapper;
import com.guddqs.monkeycomputer.product.entity.Packagedetail;
import com.guddqs.monkeycomputer.product.entity.PackagedetailExample;

@Service
public class PackageDetailBizImpl implements PackageDetailBiz {

	@Autowired
	private PackagedetailMapper mapper;

	@Override
	public int countByExample(PackagedetailExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(PackagedetailExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Packagedetail record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Packagedetail record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<Packagedetail> selectByExample(PackagedetailExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public Packagedetail selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Packagedetail record, PackagedetailExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Packagedetail record, PackagedetailExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Packagedetail record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Packagedetail record) {
		return mapper.updateByPrimaryKey(record);
	}

}
