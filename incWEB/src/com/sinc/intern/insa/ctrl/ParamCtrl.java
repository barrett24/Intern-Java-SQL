package com.sinc.intern.insa.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sinc.intern.util.Controller;
import com.sinc.intern.view.util.ModelAndView;

public class ParamCtrl implements Controller{

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("method : " + request.getMethod());
		System.out.println("url: " + request.getRequestURI());
		System.out.println("query: "+ request.getQueryString());
		request.setCharacterEncoding("utf-8");
		String msg = request.getParameter("msg");
		System.out.println("Parameter Result : " + msg);
		
		return new ModelAndView(true, "greeting.jsp");
	}
	
}
