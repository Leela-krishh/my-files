package com.cg.helathcare.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cg.helathcare.exceptions.HealthCareException;

public class JdbcUtility {

	private static Connection connection = null;

	public static Connection getConnection() throws HealthCareException {

		Properties properties = new Properties();

		File file = new File("resources/jdbc.properties");
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			throw new HealthCareException("File not exists");
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
			} catch (ClassNotFoundException e) {
				throw new HealthCareException("class not loaded..");
			} catch (SQLException e) {
				throw new HealthCareException("connection not established");
			}

		} catch (IOException e) {
			throw new HealthCareException("no data persent in fiole to read");
		}
		return connection;

	}
}
