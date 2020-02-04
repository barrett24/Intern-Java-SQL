package com.sinc.intern.ajax.ctrl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.sinc.intern.insa.model.vo.UserVO;


@WebServlet("/sinc.ajax")
public class AjaxCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		System.out.println("Ajax Control !!!");
		
		UserVO user = new UserVO("jslim", "jslim", "임정섭", 2000, "SB");
		JSONObject jobj = new JSONObject(user);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(jobj.toString());
		out.close();
	}

}
