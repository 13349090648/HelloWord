package cn.yyf.db;

import java.sql.*;

public class DbUtil {
	private String url = "jdbc:mysql://localhost:3306/java";
	private String user = "root";
	private String pwd = "root";
	
	private Connection con;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Connection getConnection() {
		try {
			return DriverManager.getConnection(url,user,pwd);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
				
	}
	
	/*
	 * 执行增删改查
	 */
	
	public int update(String sql,Object...paras) {
		try {
		    if(con==null) con = getConnection();
		    if(psmt==null) psmt = con.prepareCall(sql);
		    for(int i = 0;i<paras.length;i++) {
			    psmt.setObject(i+1, paras[i]);
		    }
		    return psmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public ResultSet query(String sql, Object...paras) {
		try {
			if(con==null) con = getConnection();
		    if(psmt==null) psmt = con.prepareCall(sql);
		    for(int i = 0;i<paras.length;i++) {
			    psmt.setObject(i+1, paras[i]);
		}
		    rs = psmt.executeQuery();
		    return rs;
	}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(psmt!=null) psmt.close();
			if(con!=null) con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
