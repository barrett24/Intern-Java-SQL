package com.sinc.intern.insa.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sinc.intern.util.Controller;
import com.sinc.intern.view.util.ModelAndView;

public class InsertCtrl implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("insertCtrl execute");	
		ModelAndView mv = new ModelAndView(false, "greeting.jsp");
		request.setAttribute("msg", "data");
		return mv;
	}
	
}
