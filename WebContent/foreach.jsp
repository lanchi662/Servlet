<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>集合的遍历</title>
</head>
<body>
<%
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
	<!-- 集合的遍历 
	for(数据类型 变量:数组/集合){}
		遍历数组  
		iterms 需要遍历的数组/集合
		var 每一个元素接受的变量名
		begin="0" end="10" step="2"
	-->
	<c:forEach items="${arr }" var="arr">
		arr:${arr }
	</c:forEach><hr>
	<c:forEach items="${list }" var="list">
		list:${list }
	</c:forEach><hr>
		<c:forEach items="${map }" var="map">
		map:${map }
	</c:forEach><hr>
		<c:forEach items="${map }" var="map">
		map:${map.key}-${map.value }
	</c:forEach><hr>
</body>
</html>