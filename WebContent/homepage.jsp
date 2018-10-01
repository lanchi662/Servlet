<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页面</title>
</head>
<body>
<table border='1' width=50px height=50px style="width: 534px; ">
	<caption>主页面</caption>
	<tr>
		<td>编号</td>
		<td>书名</td>
		<td>价格</td>
		<td>购买</td>
	</tr>
	<tr>
		<td style="width: 134px; ">1</td>
		<td>Java</td>
		<td>55</td>
		<td><a href="TestServlet?id=1&name=Java&price=55">购买</a></td>
	</tr>
		<tr>
		<td>2</td>
		<td>oracle</td>
		<td>155</td>
		<td><a href="TestServlet?id=2&name=oracle&price=155">购买</a></td>
	</tr>
	<tr>
		<td>3</td>
		<td>Html</td>
		<td>233</td>
		<td><a href="TestServlet?id=3&name=Html&price=233">购买</a></td>
		</tr>
	<tr>
		<td>4</td>
		<td>C语言</td>
		<td>2333</td>
		<td><a href="TestServlet?id=4&name=C语言&price=2333">购买</a></td>
		</tr>
	</tbody>
	</table>
</body>
</html>