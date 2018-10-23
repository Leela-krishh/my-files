package com.leela.dao;

public interface StudentDAO {

	public String addStudentDetails(StudentBean student)throws StudentException;
	public StudentBean viewStudentDetails(String studentId)throws StudentException;
	public List<StudentBean> retrivealDetails()throws StudentException;
}
