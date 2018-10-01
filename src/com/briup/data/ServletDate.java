package com.briup.data;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDate
 */
@WebServlet("/ServletDate")
public class ServletDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//session 回话HTTPSession
		/*
		 * request.getSession();====>request.getSession(true);
		 * true 代表如果当前有会话，返回此会话
		 * 如果当前没有会话创建一个会话
		 */
		//存放数据
		Date date=new Date();
		request.getSession().setAttribute("date", date);
		//移除数据
		request.getSession().removeAttribute("date");
		//覆盖数据
		request.getSession().setAttribute("date",new Date());
		//销毁数据
		request.getSession().invalidate();
		//设置存活时间
		request.getSession().setMaxInactiveInterval(60);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
