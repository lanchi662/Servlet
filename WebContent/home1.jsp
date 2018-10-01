<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.briup.base.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>el</title>
</head>
<body>
<%
	session.getAttribute("books");
	
%>
<table border="2" style="width: 651px; height: 250px; ">
	<caption style="width: 614px; ">购物</caption>
		<thead>
			<tr>
				<td>编号</td>
				<td>书名</td>
				<td>价格</td>
				<td>购买</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${books }" var="book1" varStatus="s">
			<tr>
			<td>${book1.id }</td>
			<td>${book1.name }</td>
			<td>${book1.price }</td>
			<td><a href="HomeServlet?id=${book1.id}&name=${book1.name}&price=${book1.price}">购买</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>