package com.sinc.intern.factory;

import java.util.HashMap;
import java.util.Map;

import com.sinc.intern.insa.ctrl.InsertCtrl;
import com.sinc.intern.insa.ctrl.JsonCtrl;
import com.sinc.intern.insa.ctrl.ListCtrl;
import com.sinc.intern.insa.ctrl.LoginCtrl;
import com.sinc.intern.insa.ctrl.LogoutCtrl;
import com.sinc.intern.insa.ctrl.ParamCtrl;
import com.sinc.intern.insa.ctrl.SelectCtrl;
import com.sinc.intern.main.ctrl.MainCtrl;
import com.sinc.intern.util.Controller;

public class BeanFactory {
	private static BeanFactory instance;
	private Map<String, Controller> map = new HashMap<>();
	
	private BeanFactory() {
		map.put("/incWEB/insert.inc", new InsertCtrl());
		map.put("/incWEB/select.inc", new SelectCtrl());
		map.put("/incWEB/main.inc", new MainCtrl());
		map.put("/incWEB/parameter.inc", new ParamCtrl());
		map.put("/incWEB/login.inc", new LoginCtrl());
		map.put("/incWEB/list.inc", new ListCtrl());
		map.put("/incWEB/logout.inc", new LogoutCtrl());
		map.put("/incWEB/json.inc", new JsonCtrl());
	}
	
	public static BeanFactory getInstance() {
		if (instance == null) {
			instance = new BeanFactory();
		}
		return instance;
	}
	
	public Controller getBean(String uri) {
		return map.get(uri);
	}
}
