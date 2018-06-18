/**  
 * Project Name:sidekick_crud  
 * File Name:DepartmentMapperTest.java  
 * Package Name:com.huawei.support.sidekick.dao  
 * Date:2018年6月18日上午10:46:42  
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.huawei.support.sidekick.dao;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.huawei.support.sidekick.bean.Department;

/**  
 * ClassName:DepartmentMapperTest <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年6月18日 上午10:46:42 <br/>  
 * @author   Administrator  
 * @version    
 * @since    JDK 1.8  
 * @see        
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
		Department dept1 = new Department();
		dept1.setDeptName("开发部");
		
		Department dept2 = new Department();
		dept2.setDeptName("测试部");
		
		Department dept3 = new Department();
		dept3.setDeptName("运营部");
		
		Department dept4 = new Department();
		dept4.setDeptName("采购部");
		
		Department dept5 = new Department();
		dept5.setDeptName("人力资源部");
		
		departmentMapper.insert(dept1);
		departmentMapper.insert(dept2);
		departmentMapper.insert(dept3);
		departmentMapper.insert(dept4);
		departmentMapper.insert(dept5);
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
  
