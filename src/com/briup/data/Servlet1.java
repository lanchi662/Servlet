package com.briup.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.base.Book;
import com.briup.base.Customer;

/**
 * Servlet implementation class ServletDate1
 */
@WebServlet("/index.html")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String zip=request.getParameter("zip");
		String address=request.getParameter("address");
		String telephone=request.getParameter("telephone");
		String email=request.getParameter("email");
		Customer customer=new Customer(1l, name, password, zip, address, telephone, email);
		//System.out.println(customer);
		/*//往request中存数据
		request.setAttribute("customer", customer);*/
		//往session中放数据
		request.getSession().setAttribute("customer", customer);
		//response.sendRedirect("homepage.jsp");
		//request.getRequestDispatcher("TestServlet").forward(request, response);
		request.getRequestDispatcher("homepage.jsp").forward(request, response);
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
