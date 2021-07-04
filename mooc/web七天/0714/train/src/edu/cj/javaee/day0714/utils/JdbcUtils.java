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
  
  //��ȡ���ݿ����Ӷ���ķ���,�÷����ᱻƵ��ʹ��,���ԻὫ�÷�������Ϊ�෽��
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
  
  //���ܲ������ݿ�ɹ�����ʧ��,���ն�Ҫ�رն�Ӧ�Ķ���,�÷���Ҳ�ᱻƵ��ʹ����������Ϊ�෽��
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
