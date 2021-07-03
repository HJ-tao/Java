package edu.cj.javaee.day0714.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
  public static final String SQLSERVER_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
  public static final String SQLSERVER_URL = "jdbc:sqlserver://localhost:1433;databaseName=train";
  public static final String SQLSERVER_USER = "sa";
  public static final String SQLSERVER_PWD = "sa";
  
  //获取数据库连接对象的方法,该方法会被频繁使用,所以会将该方法声明为类方法
  public static Connection getConn(){
	  Connection conn = null;
	  try {
		Class.forName(SQLSERVER_DRIVER);
		conn = DriverManager.getConnection(SQLSERVER_URL, SQLSERVER_USER, SQLSERVER_PWD);
	} catch (Exception e) {
		throw new RuntimeException(e);
	}
	  return conn;
  }
  
  /*public static void main(String[] args) {
	if (null!=getConn()) {
		System.out.println("success");
	} else {
		System.out.println("error");
	}
  }*/
  
  //不管操作数据库成功还是失败,最终都要关闭对应的对象,该方法也会被频繁使用所以声明为类方法
  public static void closeAll(ResultSet rs,Statement ps,Connection conn){
	  if (null!=rs) {  
		try {
			rs.close();
		} catch (SQLException e) {
			rs = null;
		}
	  }
	  if (null!=ps) { 
			try {
				ps.close();
			} catch (SQLException e) {
				ps = null;
			}
		}
	  if (null!=conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				conn = null;
			}
		}
     }
  
  
}
