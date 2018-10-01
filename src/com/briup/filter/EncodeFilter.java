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

//拦截地址
@WebFilter("/homepage.jsp")
public class EncodeFilter implements Filter {

    public EncodeFilter() {
       
    }

	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//编码过滤器
		//设置编码格式
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		//判断是否登录从session中取数据		
		HttpSession httpSession=req.getSession();
		String name1=(String) httpSession.getAttribute("name");
		String password1=(String) httpSession.getAttribute("password");
		//System.out.println(name1);
		if((name1=="贾俊红")&&(password1=="123456")){
			//如果登录，进入下一步
			chain.doFilter(request, response);
		}else{
			//如果没有登录，跳转登录页面
			req.getRequestDispatcher("login.html").forward(req, res);
		}
		
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
