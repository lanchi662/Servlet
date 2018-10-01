package com.briup.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest paraservletRequest, ServletResponse paraservletResponse, FilterChain pafilterChain)
			throws IOException, ServletException {
		
		
	}

	@Override
	public void init(FilterConfig pFilterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
