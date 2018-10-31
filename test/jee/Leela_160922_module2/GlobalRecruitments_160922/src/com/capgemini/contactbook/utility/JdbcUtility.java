package com.capgemini.contactbook.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.capgemini.contactbook.exception.ContactBookException;

public class JdbcUtility {
	private static Connection connection = null;

	public static Connection getConnection() throws ContactBookException {

		Properties properties = new Properties();

		File file = new File("resources/jdbc.properties");
		FileInputStream inputStream = null;
		
		try {
			inputStream = new FileInputStream(file);
		} 
		catch (FileNotFoundException e) 
		{
			throw new ContactBookException("File does not exists");
		}

		try {
			properties.load(inputStream);
			String driver = properties.getProperty("dr.driver");
			String url = properties.getProperty("db.url");
			String userName = properties.getProperty("db.username");
			String password = properties.getProperty("db.password");

			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(url, userName, password);
			} 
			catch (ClassNotFoundException e) {
				throw new ContactBookException("class not loaded");
			}
			catch (SQLException e) {
				throw new ContactBookException("connection is not established");
			}
			
			}catch (IOException e) {
				throw new ContactBookException("file doesnt contain any data to read");
			}
		
		return connection;
	}

}
