package com.sinc.intern.insa.ctrl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.sinc.intern.insa.model.vo.UserVO;
import com.sinc.intern.util.Controller;
import com.sinc.intern.view.util.ModelAndView;

public class JsonCtrl implements Controller{

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		System.out.println("JsonCtrl Execute");
		UserVO user = new UserVO("jslim", "jslim", "임정섭", 2000, "SB");
		JSONObject jobj = new JSONObject(user);

		List<Object> list = new ArrayList<>();
		list.add(user);list.add(user);list.add(user);
		JSONArray ary = new JSONArray(list);
		
		request.setAttribute("user", jobj);
		request.setAttribute("lists", ary);
		
		return new ModelAndView(true, "insa/json.jsp");	
	}
	
}
