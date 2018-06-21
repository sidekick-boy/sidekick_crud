package com.huawei.support.sidekick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.support.sidekick.bean.Employee;
import com.huawei.support.sidekick.dao.EmployeeMapper;

@Service
public class EmployeeService {

	@Autowired
	EmployeeMapper employeeMapper;
	
	public List<Employee> getAllEmployeeWithDept()
	{
		return employeeMapper.selectByExampleWithDept(null);
	}
}
