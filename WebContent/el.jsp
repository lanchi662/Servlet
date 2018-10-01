<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.briup.base.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL表达式</title>
</head>
<body>
<%
//从范围中放值 pageContext request session application
	pageContext.setAttribute("p1","dada");
	request.setAttribute("r1", "ssss");
	session.setAttribute("s1", 29);
	application.setAttribute("a1", 23);
	Customer customer=new Customer(1l,"dede","1111","2222","3333","555","2222");
	request.setAttribute("customer", customer);
	int arr[]={1,23,45,78};
	session.setAttribute("arr", arr);
	List<String> list=new ArrayList<>();
	list.add("kaka");
	list.add("dwdw");
	list.add("jiji");
	pageContext.setAttribute("list", list);
	Map<String,Integer> map=new HashMap<>();
	map.put("第一", 1);
	map.put("第二", 2);
	map.put("第三", 3);
	request.setAttribute("map", map);
	
%>
r1:<%=
//从范围中取值
	request.getAttribute("r1")
%><br>
p1:<%= pageContext.getAttribute("p1") %><br>
s1:<%= session.getAttribute("s1") %><br>
a1:<%= application.getAttribute("a1") %><br>
customer:<%= request.getAttribute("customer") %>
arr:<%= session.getAttribute("arr") %>
<hr>
	r1:${requestScope.r1 }<br>
	p1:${pageScope.p1 }<br>
	s1:${sessionScope.s1 }<br>
	a1:${applicationScope.a1 }<br>
	<!-- 6.输出运算结果或者boolean表达式 -->
	customer:${customer }<br>
	<!-- 7.输出数组、集合中的元素 -->
	list:${pageScope.list}<br>
	map:${requestScope.map}<br>
	arr:${sessionScope.arr}<hr>
	arr:${arr }<br>
	${arr[0] }
	${arr[1] }
	${arr[2] }<br>
	list:${list }<br>
	${list[0] }
	${list[1] }
	${list[2] }<br>
	map:${map }<br>
	${map["第一"] }
	${map["第二"] }
	${map["第三"] }<hr>

	
</body>
</html>