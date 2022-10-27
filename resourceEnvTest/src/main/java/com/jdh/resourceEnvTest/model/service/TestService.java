package com.jdh.resourceEnvTest.model.service;

import com.jdh.resourceEnvTest.model.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {
	@Autowired TestMapper testMapper;

	public String getTest() throws Exception {
		return testMapper.selectTest();
	}
}
