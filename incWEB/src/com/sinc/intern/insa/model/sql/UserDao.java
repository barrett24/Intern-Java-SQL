package com.sinc.intern.insa.model.sql;

import java.util.List;

public interface UserDao {
	// single finder
	public Object selectRow(Object obj);
	// multi finder
	public List<Object> selectRow();
	
	public int insertRow(Object obj);
	public int updateRow(Object obj);
	public int deleteRow(Object obj);
}
