/**  
 * Project Name:sidekick_crud  
 * File Name:DepartmentMapperTest.java  
 * Package Name:com.huawei.support.sidekick.dao  
 * Date:2018��6��18������10:46:42  
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.huawei.support.sidekick.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 部门类测试用例
 * @author sidekick
 *
 * 2018年8月8日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class DepartmentMapperTest {
	
	@Autowired
	DepartmentMapper departmentMapper;

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testCountByExample() {
		
	}

	@Test
	public void testDeleteByExample() {
		
	}

	@Test
	public void testDeleteByPrimaryKey() {
		
	}

	@Test
	public void testInsert() {
	}

	@Test
	public void testInsertSelective() {
		
	}

	@Test
	public void testSelectByExample() {
		
	}

	@Test
	public void testSelectByPrimaryKey() {
		
	}

	@Test
	public void testUpdateByExampleSelective() {
		
	}

	@Test
	public void testUpdateByExample() {
		
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		
	}

	@Test
	public void testUpdateByPrimaryKey() {
		
	}

}
  
