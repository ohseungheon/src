package com.example.test01.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.test01.domain.SimpleBbsDto;

@Mapper
public interface ISimpleBbsDao {
	public List<SimpleBbsDto> getList();
	public SimpleBbsDto getDto(@Param("id") String id);
	
	public void write(String writer,String title,String content);
	
	public void write2(String writer,String title,String content); //객체 받아서도 해보기
	//resultset rs 사용할때 stmt.executeQuery();
	//String id = rs.getInt("id")
	//String title = rs.getString("title")
	//String writer = rs.getString("writer")
	// String content = rs.getString("content")
	// 결과컬럼이 한개일떄는 rs.getString(1)

	//public void write3(@Param("writer") String writer,@Param("title") String title,@Param("content") String content);
	
	public void write3(@Param("dto") SimpleBbsDto dto);

	public void delete(String id);
}
