package com.briup.data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.briup.base.Book;



/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/*ServletContext servletContext=request.getServletContext();
		String value=(String) servletContext.getAttribute("key");*/
		//HttpSession session=request.getSession(false);
		//ȡrequest
		/*Customer customer=(Customer) request.getAttribute("customer");
		System.out.println(customer);*/
		//ȡsession
		/*HttpSession session=request.getSession(true);
		if(session!=null) {
			Book book=(Book) session.getAttribute("books");
			System.out.println(book);
			}*/
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		Book book=new Book(id, name, price);
		request.getSession().setAttribute("book",book);
		System.out.println(book);
		//request.getRequestDispatcher("TestServlet1").forward(request, response);
		request.getRequestDispatcher("success.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
