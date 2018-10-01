package com.briup.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.briup.base.Customer;
import com.briup.util.ConnectionFactory;

public  class Test {
	public static void main(String[] args) throws SQLException {
		Connection connection=ConnectionFactory.getConnection();
		String sql="select id,name,password,zip,address,telephone,email from s_jdbc";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		ResultSet resultSet=preparedStatement.executeQuery();
		List<Customer>list=new ArrayList<>();
		while(resultSet.next()){
			long id=resultSet.getLong("id");
			String name1=resultSet.getString("name");
			String password=resultSet.getString("password");
			String zip=resultSet.getString("zip");
			String address=resultSet.getString("address");
			String telephone=resultSet.getString("telephone");
			String email=resultSet.getString("email");
			Customer customer=new Customer(id, name1, password, zip, address, telephone, email);
			
			list.add(customer);
			
			
		}
		System.out.println(list);
	}

}
