package com.sinc.intern.insa.service;

import java.util.List;

import com.sinc.intern.insa.model.sql.UserDao;
import com.sinc.intern.insa.model.sql.UserDaoImpl;

public class UserServiceImpl implements UserService {
	private UserDao dao;
	
	public UserServiceImpl() {
		dao = new UserDaoImpl();
	}

	@Override
	public Object select(Object obj) {
		System.out.println("User service select");
		return dao.selectRow(obj);
	}

	@Override
	public List<Object> select() {
		System.out.println("UserService list");
		return dao.selectRow(); 
	}

	@Override
	public int insert(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
