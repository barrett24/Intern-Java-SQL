package com.sinc.intern.tv.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.sinc.intern.tv.model.vo.LgTV;
import com.sinc.intern.tv.model.vo.SamsungTV;
import com.sinc.intern.tv.util.TV;

// 싱글턴 팩토리
public class BeanFactory {
	private static BeanFactory instance;
	private Map<String, TV> ary;
			
	// 객체 생성은 한번만
	private BeanFactory() {
		ary = new HashMap<String, TV>();
		ary.put("samsung", new SamsungTV());
		ary.put("lg", new LgTV());
	}
	
	// 생성자가 private이기때문에 자신을 리턴하는 매서드
	public static BeanFactory getInstance() {
		if (instance == null) {
			instance = new BeanFactory();
		}
		return instance;
	}
	
	public TV getBrand(String brand) {
		return ary.get(brand);
	}
}
