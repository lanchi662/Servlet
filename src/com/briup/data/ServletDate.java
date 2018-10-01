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
		//session �ػ�HTTPSession
		/*
		 * request.getSession();====>request.getSession(true);
		 * true ���������ǰ�лỰ�����ش˻Ự
		 * �����ǰû�лỰ����һ���Ự
		 */
		//�������
		Date date=new Date();
		request.getSession().setAttribute("date", date);
		//�Ƴ�����
		request.getSession().removeAttribute("date");
		//��������
		request.getSession().setAttribute("date",new Date());
		//��������
		request.getSession().invalidate();
		//���ô��ʱ��
		request.getSession().setMaxInactiveInterval(60);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
