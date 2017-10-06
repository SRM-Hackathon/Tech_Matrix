package com.la.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {

	
	private static Connection connection = null;
	private static Config instance;

	private Config()
	{
		
		String DB_NAME ="law_automaton";
		String DB_USERNAME = "root";
		String DB_PASSWORD ="";
		String HOST ="localhost";
		String DB_PORT ="3306";

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://"+HOST+":"+DB_PORT+"/"+DB_NAME,DB_USERNAME,DB_PASSWORD);


		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
	}


	public static boolean checkCloseConnection()
	{
		try {
			connection.isClosed();
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return true;
		}
	}

	public static Config getInstance()
	{
		if(instance == null || connection == null || checkCloseConnection() ) {
			instance = new Config();
		}
		return instance;
	}
	public Connection getConnection()
	{
		return connection;
	}

	

	public static Connection getConnect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql:localhost:3306/law_automaton","root","");

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		return connection;
	}



}
