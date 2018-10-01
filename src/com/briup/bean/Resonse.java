package com.briup.bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.base.Customer;
//@WebServlet("/index.html")
public class Resonse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String zip=request.getParameter("zip");
		String address=request.getParameter("address");
		String telephone=request.getParameter("telephone");
		String email=request.getParameter("email");
		Customer customer=new Customer(1l,name,password,zip,address,telephone,email);
	   /* int num=(int)(Math.random()*100);
		if(num%2==0){
			
		request.getRequestDispatcher("/login.html").forward(request, response);
		
		}else{
			
		response.sendRedirect("fail.html");
		
		}*/
		PrintWriter printWriter=null;
		int num=(int)(Math.random()*100);
		
			String basepath=request.getRealPath("/");
		if(num%2==0){
			printWriter=response.getWriter();
						File file=new File(basepath,"login.html");
			BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
			String info=null;
			while((info=bufferedReader.readLine())!=null){
				printWriter.write(info);
			}
			bufferedReader.close();
			printWriter.close();
		}else{
			printWriter=response.getWriter();
			File file=new File(basepath,"fail.html");
			BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
			String info=null;
			while((info=bufferedReader.readLine())!=null){
				printWriter.write(info);
			}
			bufferedReader.close();
			printWriter.close();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
