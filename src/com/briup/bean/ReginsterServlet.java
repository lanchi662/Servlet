package com.briup.bean;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.base.Customer;
/*
 * 
 * 
 * 
 * 
 */
//@WebServlet("/index.html")
public class ReginsterServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
		req.setCharacterEncoding("UTF-8");
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String zip=req.getParameter("zip");
		String address=req.getParameter("address");
		String telephone=req.getParameter("telephone");
		String email=req.getParameter("email");
		Customer customer=new Customer(1l,name,password,zip,address,telephone,email);
		//System.out.println(customer);
		JDBCUser jdbcUser=new JDBCUser();
		jdbcUser.saveUser(customer);

		String method=req.getMethod();
	
		
		//resp.setContentType("text/html;charset=utf-8");
	/*	PrintWriter printWriter=null;
		if(customer.getPassword().equals(req.getParameter("password"))){
			 printWriter=resp.getWriter();
			printWriter.println("锟斤拷陆锟缴癸拷");
		}else{
			printWriter.println("锟斤拷录失锟斤拷");
		}*/
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
