/**  
 * Project Name:sidekick_crud  
 * File Name:EmployeeMapperTest.java  
 * Package Name:com.huawei.support.sidekick.dao  
 * Date:2018年6月18日上午11:19:49  
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

import com.huawei.support.sidekick.bean.Employee;

/**  
 * ClassName:EmployeeMapperTest <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年6月18日 上午11:19:49 <br/>  
 * @author   Administrator  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class EmployeeMapperTest {
	
	@Autowired
	EmployeeMapper empMapper;

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
		
		Employee emp1 = new Employee(null, "jingli", "男", "jingli@huawei.com");
		empMapper.insert(emp1);
		
		Employee emp2 = new Employee(null, "xiaohong", "女" , "xiaohong@huawei.com", 5 , null);
		empMapper.insert(emp2 );
		
		Employee emp3 = new Employee(null, "xiaoming", "男", "xiaoming@huawei.com", 1 , null);
		empMapper.insert(emp3 );
		
		Employee emp4 = new Employee(null, "xiaodong", "男", "xiaodong@huawei.com", 3, null);
		empMapper.insert(emp4 );
		
		
		Employee emp5 = new Employee(null, "xiaoping", "女" , "xiaoping@huawei.com", 2, null);
		empMapper.insert(emp5 );
		
		Employee Emp6 = new Employee(null, "xiaoli", "女", "xiaoli@huawei.com", 4);
		empMapper.insert(Emp6);
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
	public void testSelectByExampleWithDept() {
		
	}

	@Test
	public void testSelectByPrimaryKeyWithDept() {
		
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
  
