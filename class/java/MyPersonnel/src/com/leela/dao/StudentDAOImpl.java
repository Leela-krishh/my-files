package com.leela.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StudentDAOImpl implements StudentDAO{

	Logger logger=Logger.getRootLogger();
	public StudentDAOImpl(){
		PropertyConfigurator.configure("resources//log4j.properties");
	}
	
	public String addStudentDetails(StudentBean student)throws StudentException
	Connection connection=DBConnection.getInstance().getConnection();
	
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
	
	String studentId=null;
	int queryResult=0;
	
	try{
		preparedStatement=connection.prepareStatement(QueryMapper.INSERT_QUERY);
		preparedStatement.setString(1, student.getStuName());
		preparedStatement.setString(2,student.getPhnNo());
		preparedStatement.setDouble(3,student.getFees());			
		
		queryResult=preparedStatement.executeUpdate();
	
		preparedStatement = connection.prepareStatement(QueryMapper.STUDID_QUERY_SEQUENCE);
		resultSet=preparedStatement.executeQuery();

		if(resultSet.next())
		{
			stuId=resultSet.getString(1);
					
		}

		if(queryResult==0)
		{
			logger.error("Insertion failed ");
			throw new StudentException("Inserting student details failed ");

		}
		else
		{
			logger.info("Student details added successfully:");
			return stuId;
		}

	}
	catch(SQLException sqlException)
	{
		sqlException.printStackTrace();
		logger.error(sqlException.getMessage());
		throw new StudentException("Tehnical problem occured refer log");
	}

	finally
	{
		try 
		{
			//resultSet.close();
			preparedStatement.close();
			connection.close();
		}
		catch (SQLException sqlException) 
		{
			sqlException.printStackTrace();
			logger.error(sqlException.getMessage());
			throw new StudentException("Error in closing db connection");

		}
	}
	
	
}
public StudentBean viewStudentDetails(String stuId) throws StudentException {
	
	Connection connection=DBConnection.getInstance().getConnection();
	
	
	PreparedStatement preparedStatement=null;
	ResultSet resultset = null;
	StudentBean bean=null;
	
	try
	{
		preparedStatement=connection.prepareStatement(QueryMapper.VIEW_DONAR_DETAILS_QUERY);
		preparedStatement.setString(1,stuId);
		resultset=preparedStatement.executeQuery();
		
		if(resultset.next())
		{
			bean = new StudentBean();
			bean.setStuName(resultset.getString(1));
			bean.setPhnNo(resultset.getString(2));
			bean.setFees(resultset.getDouble(3));
			
		}
		
		if( bean != null)
		{
			logger.info("Record Found Successfully");
			return bean;
		}
		else
		{
			logger.info("Record Not Found Successfully");
			return null;
		}
		
	}
	catch(Exception e)
	{
		logger.error(e.getMessage());
		throw new StudentException(e.getMessage());
	}
	finally
	{
		try 
		{
			resultset.close();
			preparedStatement.close();
			connection.close();
		} 
		catch (SQLException e) 
		{
			logger.error(e.getMessage());
			throw new StudentException("Error in closing db connection");

		}
	}
	
}

public List<StudentBean> retriveAllDetails() throws StudentException {
	
	Connection con=DBConnection.getInstance().getConnection();
	int studentCount = 0;
	
	PreparedStatement ps=null;
	ResultSet resultset = null;
	
	List<StudentBean> studentList=new ArrayList<StudentBean>();
	try
	{
		ps=con.prepareStatement(QueryMapper.RETRIVE_ALL_QUERY);
		resultset=ps.executeQuery();
		
		while(resultset.next())
		{	
			StudentBean bean=new StudentBean();
			bean.setStuName(resultset.getString(1));
			bean.setPhnNo(resultset.getString(2));
			bean.setFees(resultset.getDouble(3));
			studentList.add(bean);
			
			studentCount++;
		}			
		
	} catch (SQLException sqlException) {
		logger.error(sqlException.getMessage());
		throw new StudentException("Tehnical problem occured. Refer log");
	}
	
	finally
	{
		try 
		{
			resultset.close();
			ps.close();
			con.close();
		} 
		catch (SQLException e) 
		{
			logger.error(e.getMessage());
			throw new StudentException("Error in closing db connection");

		}
	}
	
	if( studentCount == 0)
		return null;
	else
		return studentList;
}

}
