package com.capgemini.contactbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capgemini.contactbook.exception.ContactBookException;
import com.capgemini.contactbook.utility.JdbcUtility;

import com.igate.contactbook.bean.EnquiryBean;

public class ContactBookDaoImpl implements ContactBookDao {
	
	Connection connection = null;
	PreparedStatement statement = null;
	static Logger logger = Logger.getLogger(ContactBookDaoImpl.class);
	
	@Override
	public EnquiryBean getEnquiryDetails(int EnquryID) throws ContactBookException {
		logger.info("in getting enquiryDetails  mehtod");

		connection = JdbcUtility.getConnection();
		EnquiryBean enqbean1 =null;
		try {
			statement = connection.prepareStatement(QueryConstants.getDetails);
			statement.setInt(1, EnquryID);
			ResultSet resultSet=null;
			resultSet = statement.executeQuery();
			resultSet.next();
			enqbean1= new EnquiryBean();
			enqbean1.setEnqryId(resultSet.getInt(1));
			enqbean1.setfName(resultSet.getString(2));
			enqbean1.setlName(resultSet.getString(3));
			enqbean1.setContactNo(Long.toString(resultSet.getLong(4)));
			enqbean1.setpDomain(resultSet.getString(5));
			enqbean1.setpLocation(resultSet.getString(6));

			

		}
		catch (SQLException e) {
			logger.error("in enquiryDetails method exception is: " + e.getMessage());
			throw new ContactBookException(" sorry no details found!!");
		}
		return enqbean1;
	}

	@Override
	public int addEnquiry(EnquiryBean enqry) throws ContactBookException
	{
		
		logger.info("in add patientDeatils  method");
		connection = JdbcUtility.getConnection();

		try {
			statement = connection.prepareStatement(QueryConstants.insertQuery);
			statement.setString(1,enqry.getfName());
			statement.setString(2,enqry.getlName());
			statement.setLong(3,Long.parseLong(enqry.getContactNo()));
			statement.setString(4,enqry.getpDomain());
			statement.setString(5,enqry.getpLocation());

			statement.executeUpdate();

			statement = connection.prepareStatement(QueryConstants.getIdQuery);
			ResultSet rs = statement.executeQuery();
			rs.next();
			int id=rs.getInt(1);
			return id;

		} catch (SQLException e) {
			logger.error("statement not created");
			throw new ContactBookException("statement not created");
		}
	
	}
	
}
