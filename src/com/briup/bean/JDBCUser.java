package com.briup.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.briup.base.Customer;
import com.briup.util.ConnectionFactory;
/*
 create table s_jdbc(
 	id number,
   	name varchar2(50),
   	password varchar2(50),
   	zip varchar2(50),
	address varchar2(50),
	telephone varchar2(50),
	email varchar2(50)
	);
 * 
 */
public class JDBCUser {
	
	public void saveUser(Customer customer){
		//��ȡ���Ӷ���
		try {
			Connection connection=ConnectionFactory.getConnection();
			//System.out.println(connection);
			//��ȡPreparedStatement����
			String sql="insert into s_jdbc(id,name,password,zip,address,telephone,email) values (t_jdbc_seq.nextval,?,?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			//ִ��sql���
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getPassword());
			preparedStatement.setString(3, customer.getZip());
			preparedStatement.setString(4, customer.getAddress());
			preparedStatement.setString(5, customer.getTelephone());
			preparedStatement.setString(6,customer.getEmail());
			preparedStatement.executeUpdate();
			//�ر���Դ
			ConnectionFactory.close(connection, preparedStatement, null);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	
	}
	

}
