package com.sinc.intern.insa.service;

import java.util.List;

public interface UserService {
	// single finder
	public Object select(Object obj);
	// multi finder
	public List<Object> select();
			
	public int insert(Object obj);
	public int update(Object obj);
	public int delete(Object obj);
}
