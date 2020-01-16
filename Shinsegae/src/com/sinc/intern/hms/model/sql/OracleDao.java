package com.sinc.intern.hms.model.sql;

import java.util.List;

public interface OracleDao {
	// CRUD
	public int insertRow(Object obj);
	public int updateRow(Object obj);
	public int deleteRow(Object obj);
	
	public List<Object> selectRow(); // DTO나 VO가 들어가는 식으로
	public Object selectRow(Object obj); // 특정 row 객채형식으로 
	
	
	
}
