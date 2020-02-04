package com.sinc.intern.ajax.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import com.sinc.intern.insa.model.vo.UserVO;

@WebServlet("/param_sinc.ajax")
public class ParamServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		System.out.println("ParamServlet ~~ ");
		String id = request.getParameter("id");
		System.out.println("Param id : " + id);
		
		UserVO user = new UserVO("jslim", "jslim", "임정섭", 2000, "SB");
		List<Object> list = new ArrayList<>();
		list.add(user);list.add(user);list.add(user);
		JSONArray ary = new JSONArray(list);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(ary.toString());
		out.close();
	}

}
