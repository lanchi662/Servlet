package com.briup.bean;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.briup.base.Customer;
//@WebServlet("/index.html")
public class FirstServer implements Servlet{

	@Override
	public void destroy() {
		//System.out.println("sws init....");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public String getServletInfo() {
		
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		//System.out.println("FirstServer init....");
		
	}

	@Override
	public void service(ServletRequest paramServletRequest, ServletResponse paramServletResponse) throws ServletException, IOException {
		//System.out.println("service......");
		ArrayList<Customer>list=new ArrayList<>();
		Customer customer=new Customer();
		
		//获取多个值
		//String [] strings=paramServletRequest.getParameterValues("name");
		
		/*BufferedReader bufferedReader=paramServletRequest.getReader();
		String info=null;
		while((info=bufferedReader.readLine())!=null){
			System.out.println(info);
		}*/
		//获取一个值
		paramServletRequest.setCharacterEncoding("UTF-8");
		customer.setName(paramServletRequest.getParameter("name"));
		customer.setPassword(paramServletRequest.getParameter("password"));
		customer.setZip(paramServletRequest.getParameter("zip"));
		customer.setAddress(paramServletRequest.getParameter("address"));
		customer.setTelephone(paramServletRequest.getParameter("telephone"));
		customer.setEmail(paramServletRequest.getParameter("email"));
		list.add(customer);
		for (Customer customer1 : list) {
			System.out.println(customer1);
		}
		/*String password=paramServletRequest.getParameter("password");
		if(!(customer.getPassword().equals(password))){
			PrintWriter printWriter=paramServletResponse.getWriter();
			printWriter.println("密码错误");
		}*/
	/*PrintWriter printWriter=paramServletResponse.getWriter();
	printWriter.println("hello");*/
		//返回所有的值
		/*Map<String, String[]> map=paramServletRequest.getParameterMap();
		for (String key : map.keySet()) {
			String[] value=map.get(key);
			System.out.println(key+"="+value);
		}*/
	}

}
