<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.briup.util.ConnectionFactory"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.briup.base.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jstl</title>
</head>
<body>
<%
	Connection connection=ConnectionFactory.getConnection();
	String sql="select id,name,password,zip,address,telephone,email from s_jdbc";
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	ResultSet resultSet=preparedStatement.executeQuery();
	List<Customer> list=new ArrayList<>();;
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
		request.setAttribute("list", list);
	}
	
%>
	${list }
<table border="1">
<caption>顾客</caption>
	<thead>
		<tr>
			<td>序号</td>
			<td>名字</td>
			<td>密码</td>
			<td>邮编</td>
			<td>地址</td>
			<td>电话</td>
			<td>电子邮件</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list }" var="customer" varStatus="s">
		<tr>		
			<td>${customer.id }</td>
			<td>${customer.name }</td>
			<td>${customer.password }</td>
			<td>${customer.zip }</td>
			<td>${customer.address }</td>
			<td>${customer.telephone }</td>
			<td>${customer.email }</td>
		</tr>
		</c:forEach>
	</tbody>

</table>
</body>
</html>