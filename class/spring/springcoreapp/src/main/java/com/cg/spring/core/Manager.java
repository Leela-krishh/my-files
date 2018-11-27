package com.cg.spring.core;

public class Manager {

	private int deptno;
	private String projectName;
	private long projectCode;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public long getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(long projectCode) {
		this.projectCode = projectCode;
	}
	@Override
	public String toString() {
		return "Manager [deptno=" + deptno + ", projectName=" + projectName + ", projectCode=" + projectCode + "]";
	}
}
