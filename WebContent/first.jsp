<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List" %>
<%@page import="com.briup.base.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" session="true" isThreadSafe="true" autoFlush="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>lala</title>
</head>
<body>
<%="helloworld" %>
<%
	int a=10;
	int b=0;
	//int sum=a/b;
%>
<%!
	private int age;
	public void test(String info){
		System.out.println("--"+info+"--");
	}
%>
<%
	test("lala");

%>
<%	
	Customer customer=new Customer();
	System.out.println(customer.getName());
	List<String>list=new ArrayList<String>();
	list.add("hello");
%>
<%--页面跳转 --%>
<%--<jsp:forward page="homepage.jsp"></jsp:forward> --%>

</body>
</html>