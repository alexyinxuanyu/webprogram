package com.xzit.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EcodingFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest rq, ServletResponse rp,
			FilterChain chain) throws IOException, ServletException {
		   HttpServletRequest request=(HttpServletRequest)rq;
		   HttpServletResponse response=(HttpServletResponse)rp;
           request.setCharacterEncoding("utf-8");
           response.setCharacterEncoding("utf-8");
           chain.doFilter(request, response);
	}

	public void init(FilterConfig arg0) throws ServletException {


	}

}
