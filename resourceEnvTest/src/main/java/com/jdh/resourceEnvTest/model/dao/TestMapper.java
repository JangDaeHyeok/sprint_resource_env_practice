package com.jdh.resourceEnvTest.model.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
	public String selectTest() throws Exception;
}
