package com.sinc.intern.insa.model.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.sinc.intern.insa.model.vo.UserDTO;
import com.sinc.intern.insa.model.vo.UserVO;

public class UserDaoImpl implements UserDao {
	
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	public static final String USER = "hr";
	public static final String PASSWD = "hr";
	
	// 드라이버 로딩
	public UserDaoImpl() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// db 연동
	@Override
	public Object selectRow(Object obj) {
		System.out.println("UserDao selectRow") ;
		System.out.println("Dao user : "+obj); 
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ; 
		ResultSet		  rset  = null ; 
		String loginSQL = "SELECT * FROM INTERN_USER_TBL WHERE ID = ? AND PWD = ? " ; 
		UserVO user = null ; 
		try{
			conn  = DriverManager.getConnection(URL, USER, PASSWD) ; 
			pstmt = conn.prepareStatement(loginSQL); 
			pstmt.setString(1, ((UserDTO)obj).getId());
			pstmt.setString(2, ((UserDTO)obj).getPwd());
			rset = pstmt.executeQuery() ; 
			if(rset.next()) {
				user = new UserVO(	rset.getString(1),
									rset.getString(2),
									rset.getString(3),
									rset.getDouble(4),
									rset.getString(5)) ; 
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{
				if( conn != null ) { conn.close(); }
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return user ; 
	}

	@Override
	public List<Object> selectRow() {
		return null;
	}

	@Override
	public int insertRow(Object obj) {
		return 0;
	}

	@Override
	public int updateRow(Object obj) {
		return 0;
	}

	@Override
	public int deleteRow(Object obj) {
		return 0;
	}
	
}
