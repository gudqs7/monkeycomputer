package com.guddqs.monkeycomputer.product.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.product.entity.Packagedetail;
import com.guddqs.monkeycomputer.product.entity.PackagedetailExample;

public interface PackageDetailBiz {
	int countByExample(PackagedetailExample example);

    int deleteByExample(PackagedetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Packagedetail record);

    int insertSelective(Packagedetail record);

    List<Packagedetail> selectByExample(PackagedetailExample example);

    Packagedetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Packagedetail record, @Param("example") PackagedetailExample example);

    int updateByExample(@Param("record") Packagedetail record, @Param("example") PackagedetailExample example);

    int updateByPrimaryKeySelective(Packagedetail record);

    int updateByPrimaryKey(Packagedetail record);
}
