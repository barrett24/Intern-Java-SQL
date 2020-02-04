package com.sinc.intern.insa.ctrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sinc.intern.insa.service.UserService;
import com.sinc.intern.insa.service.UserServiceImpl;
import com.sinc.intern.util.Controller;
import com.sinc.intern.view.util.ModelAndView;

public class ListCtrl implements Controller{
	private UserService service;
	
	public ListCtrl() {
		service = new UserServiceImpl();
	}
	
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ListCtrl execute");
		List<Object> list = service.select();
		request.setAttribute("lists", list);
		return new ModelAndView(true, "list.jsp");
	}
	
}
