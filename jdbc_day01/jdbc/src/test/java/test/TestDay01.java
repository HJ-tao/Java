package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.junit.Test;

import util.DBTool;

/**
 *	junit测试方法:
 *	1.方法是公有的,无返回值的,无参数的
 *	2.方法前必须加@Test
 *	3.由于junit用于测试,而测试代码和包
 *	  在正式项目环境中会被抛弃,所以junit
 *	  的包不必使用maven导入也可.
 */
public class TestDay01 {

	/**
	 * 创建连接
	 */
	@Test
	public void test1() {
		System.out.println(1);
		//注册驱动,即告诉
		//DriverManager要用哪一个驱动
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//创建连接
			Connection conn = 
				DriverManager.getConnection(
				"jdbc:oracle:thin:@192.168.201.227:1521:orcl", 
				"openlab", "open123");
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 如何使用Properties类读取properties文件:
	 * Properties类本质上就是Map,专门用来读取
	 * properties文件.
	 */
	@Test
	public void test2() {
		System.out.println(2);
		Properties p = new Properties();
		try {
			//1.通过任意的类都能获取ClassLoader
			//2.ClassLoader可以加载classes下的文件
			//3.在真正的WEB项目内,运行的就是classes
			//  之下的文件,其他文件会被丢弃
			p.load(TestDay01.class.getClassLoader()
				.getResourceAsStream("db.properties"));
			System.out.println(p.getProperty("driver"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 测试DBTool
	 */
	@Test
	public void test3() {
		Connection conn = null;
		try {
			conn = DBTool.getConnection();
			System.out.println(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBTool.close(conn);
		}
	}
	
	/**
	 * 执行insert语句,增加一个员工.
	 */
	@Test
	public void test4() {
		Connection conn = null;
		try {
			//创建连接
			conn = DBTool.getConnection();
			//创建Statment,用于执行SQL
			Statement smt = conn.createStatement();
			//写SQL
			String sql = 
				"insert into emps_lhh values("
				+ "emps_seq_lhh.nextval,"
				+ "'唐僧','总监',0,sysdate,"
				+ "8000.0,6000.0,3)";
			//执行SQL,返回该SQL所影响的行数
			int rows = smt.executeUpdate(sql);
			System.out.println(rows);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBTool.close(conn);
		}
	}
	
	/**
	 * 执行select语句,查询一些员工.
	 */
	@Test
	public void test5() {
		Connection conn = null;
		try {
			conn = DBTool.getConnection();
			Statement smt = conn.createStatement();
			String sql = 
				"select * from emps_lhh "
				+ "where sal>6000.0 "
				+ "order by empno";
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()) {
				//每次next(),可以获取一行数据,
				//该行中包含多列数据.
				//rs.get类型(字段序号)
				//rs.get类型(字段名)
				System.out.println(rs.getInt("empno"));
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getDouble("sal"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBTool.close(conn);
		}
	}
	
}





