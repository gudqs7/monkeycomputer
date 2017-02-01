package com.guddqs.monkeycomputer.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guddqs.monkeycomputer.user.entity.Userinfo;
import com.guddqs.monkeycomputer.user.entity.UserinfoExample;

public interface UserinfoMapper {
    int countByExample(UserinfoExample example);

    int deleteByExample(UserinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    List<Userinfo> selectByExample(UserinfoExample example);

    Userinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}