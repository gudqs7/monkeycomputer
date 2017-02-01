package com.guddqs.monkeycomputer.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.user.entity.Login;
import com.guddqs.monkeycomputer.user.entity.LoginExample;

public interface LoginMapper {
    
	//统计总个数
	int countByExample(LoginExample example);

	//根据条件批量删除
	int deleteByExample(LoginExample example);

	//根据主键删除
    int deleteByPrimaryKey(Integer loginid);

    //插入一条Login表记录
    int insert(Login record);

    //有选择性插入(为空不插入)
    int insertSelective(Login record);

    //根据条件查询Login表记录集
    List<Login> selectByExample(LoginExample example);

    //查询指定主键的Login表记录
    Login selectByPrimaryKey(Integer loginid);

    /**
     * 通过指定条件批量更新Login表(更新为同一值)
     * @param record 要跟新的实体类
     * @param example 筛选条件
     * @return 返回记录条数
     */
    int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginExample example);

    
    int updateByExample(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
}