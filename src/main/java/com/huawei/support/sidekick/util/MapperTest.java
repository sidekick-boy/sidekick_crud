/**  
 * Project Name:sidekick_crud  
 * File Name:MapperTest.java  
 * Package Name:com.huawei.support.sidekick.util  
 * Date:2018年6月17日上午11:46:36  
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.huawei.support.sidekick.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 
 * ClassName: MapperTest <br/>  
 * Function: CRUED功能测试. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2018年6月17日 下午12:06:58 <br/>  
 *  
 * @author sidekick  
 * @version   
 * @since JDK 1.8
 */

import com.huawei.support.sidekick.bean.Department;
import com.huawei.support.sidekick.dao.DepartmentMapper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	@Test
	public void testCRUD()
	{
		System.out.println(departmentMapper);
		Department department = new Department(null, "开发部");
		int selective = departmentMapper.insertSelective(department);
		System.out.println(selective);
	}

}
  
