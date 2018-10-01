<%@page import="com.briup.base.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true" isThreadSafe="true" autoFlush="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>incond</title>
</head>
<body>
 <jsp:useBean id="u1" class="com.briup.base.Customer" scope="request"></jsp:useBean>
<jsp:setProperty property="name" name="u1" value="zhangsan"/>
<jsp:setProperty property="zip" name="u1" value="ssss"/>
<%
	Customer customer=new Customer();
	customer.setName("lala");
	customer.setZip("eeee");
	request.setAttribute("u2",customer);
%>
	u1:<%=request.getAttribute("u1")%><hr>
	u2:<%=request.getAttribute("u2") %>
<jsp:getProperty property="name" name="u1"/>
</body>
</html>