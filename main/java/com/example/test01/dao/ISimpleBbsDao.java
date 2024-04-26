package com.example.test01.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.test01.domain.SimpleBbsDto;

@Mapper
public interface ISimpleBbsDao {
	public List<SimpleBbsDto> getList();
}
