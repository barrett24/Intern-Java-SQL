package com.sinc.intern.main.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sinc.intern.util.Controller;
import com.sinc.intern.view.util.ModelAndView;

public class MainCtrl implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		System.out.println("MainCtrl execute");
		return new ModelAndView(true, "main.jsp");
	}
	
}
