package com.briup.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.descriptor.web.LoginConfig;

/**
 * Servlet Filter implementation class EnxodeFilter
 */

//���ص�ַ
@WebFilter("/homepage.jsp")
public class EncodeFilter implements Filter {

    public EncodeFilter() {
       
    }

	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//���������
		//���ñ����ʽ
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		//�ж��Ƿ��¼��session��ȡ����		
		HttpSession httpSession=req.getSession();
		String name1=(String) httpSession.getAttribute("name");
		String password1=(String) httpSession.getAttribute("password");
		//System.out.println(name1);
		if((name1=="�ֿ���")&&(password1=="123456")){
			//�����¼��������һ��
			chain.doFilter(request, response);
		}else{
			//���û�е�¼����ת��¼ҳ��
			req.getRequestDispatcher("login.html").forward(req, res);
		}
		
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
