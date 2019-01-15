package com.huawei.support.sidekick.bean;

/**
 * 员工所属部门
 * 
 * @author sidekick
 *
 * 2019年1月15日
 */
public class Department {
	/**
	 * 部门Id
	 */
	private Integer deptId;

	/**
	 * 部门名称
	 */
	private String deptName;

	public Department(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public Department() {
		super();
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName == null ? null : deptName.trim();
	}
}