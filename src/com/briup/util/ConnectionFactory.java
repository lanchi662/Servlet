package com.briup.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 1 2 6   
 *   3 4 5 
 * */
public class ConnectionFactory {
	private static String driverName;
	private static String url;
	private static String user;
	private static String password;
	
	static {
		try {
			Properties properties=new Properties();
//		properties.put("author", "briup");
//			Reader reader=new FileReader("src/com/briup/utils/db.properties");
			InputStream reader=ConnectionFactory.class.getResourceAsStream("db.properties");
			properties.load(reader);
			
			driverName=properties.getProperty("driver");
			url=properties.getProperty("url");
			user=properties.getProperty("user");
			password=properties.getProperty("password");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * �����ļ���XML properties  
	 * 
	 * ��ȡ���Ӷ���
	 * */
	public static Connection getConnection() {
		Connection connection=null;
		try {
	//		1.ע������ 4 ȫ����  
			Class.forName(driverName);
	//		2.��ȡ���ݿ����Ӷ��� Connection
			connection=
					DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	/**
	 * 	�ر���Դ
	 * */
	public static  void close(Connection connection,Statement pStatement,ResultSet resultSet) {
		try {
			if(resultSet!=null) {
				resultSet.close();
			}
			if(pStatement!=null) {
				pStatement.close();
			}
			if(connection!=null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}







