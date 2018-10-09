package com.huawei.support.sidekick.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huawei.support.sidekick.bean.Employee;
import com.huawei.support.sidekick.service.EmployeeService;
/**
 * 员工列表增删改查控制器
 * @author sidekick
 *
 * 2018年6月21日
 */
@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/emps")
	public String getAllEmployee(@RequestParam(value = "pn", defaultValue = "1")Integer pn, Model model)
	{
		PageHelper.startPage(pn, 5);
		List<Employee> empList = employeeService.getAllEmployeeWithDept();		
		PageInfo<Employee> pageInfo = new PageInfo<>(empList, 5);
		model.addAttribute("pageInfo", pageInfo);
		
		return "empList";
	}
}
