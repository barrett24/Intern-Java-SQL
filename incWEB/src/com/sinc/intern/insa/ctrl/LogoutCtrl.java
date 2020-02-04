package com.sinc.intern.insa.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sinc.intern.util.Controller;
import com.sinc.intern.view.util.ModelAndView;

public class LogoutCtrl implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		session.invalidate();
		System.out.println("bye~~~");
		return new ModelAndView(false, "index.jsp");
	}
	
}
