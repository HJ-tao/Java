package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import util.DBUtil;

public class TestDay02 {

	/**
	 * 测试DBUtil
	 * 删除一个员工
	 */
	@Test
	public void test1() {
		//假设浏览器传入了删除条件:
		int empno = 6;
		
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			System.out.println(conn);
			Statement smt = conn.createStatement();
			String sql = 
				"delete from emps_lhh "
				+ "where empno=" + empno;
			smt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}
	
	/**
	 * 使用PS对象执行insert语句,
	 * 增加一个员工.
	 */
	@Test
	public void test2() {
		//假设浏览器传入的数据如下:
		String ename = "刘备";
		String job = "打仗";
		int mgr = 0;
		Date hiredate = new Date(
			System.currentTimeMillis());
		double sal = 100.0;
		double comm = 60000.0;
		int deptno = 9;
		
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			//创建PS,并让它发送SQL,
			//由数据库将SQL编译成计划.
			String sql = 
				"insert into emps_lhh values("
				+ "emps_seq_lhh.nextval,"
				+ "?,?,?,?,?,?,?)";
			PreparedStatement ps = 
				conn.prepareStatement(sql);
			//设置参数值(将值存入ps)
			//ps.set类型(?的序号,?的值)
			ps.setString(1, ename);
			ps.setString(2, job);
			ps.setInt(3, mgr);
			ps.setDate(4, hiredate);
			ps.setDouble(5, sal);
			ps.setDouble(6, comm);
			ps.setInt(7, deptno);
			//向数据库发送参数值,
			//促使数据库执行计划.
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}
	
	/**
	 * 执行select语句,查询一些员工.
	 */
	@Test
	public void test3() {
		//假设浏览器传入的查询条件是
		String job = "销售";
		
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = 
				"select * from emps_lhh "
				+ "where job=?";
			PreparedStatement ps = 
				conn.prepareStatement(sql);
			ps.setString(1, job);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(
					rs.getInt("empno"));
				System.out.println(
					rs.getString("ename"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}
	
	/**
	 * 模拟登录的业务,使用PS对象执行
	 * 查询SQL,看是否会被注入攻击.
	 */
	@Test
	public void test4() {
		//假设用户的登录信息如下:
		String username = "zhangsan";
		String password = "a' or 'b'='b";
		
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = 
				"select * from users_lhh "
				+ "where username=? "
				+ "and password=?";
			PreparedStatement ps = 
				conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("登录成功");
			} else {
				System.out.println("登录失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}
	
	/**
	 * 使用ResultSetMetaData
	 */
	@Test
	public void test5() {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = 
				"select * from emps_lhh";
			Statement smt = conn.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			ResultSetMetaData md = rs.getMetaData();
			System.out.println(md.getColumnCount());
			System.out.println(md.getColumnTypeName(1));
			System.out.println(md.getColumnName(1));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}
	
	/**
	 * 模拟转账的业务
	 * 
	 * 前提:
	 * 	假设张三已经登录了网银,并且已经输入了
	 * 	收款方李四的账号及转账金额,点击了确定.
	 * 
	 * 步骤:
	 * 	1.查看付款方的余额,看够不够
	 *  2.查看收款方的账号,看对不对
	 *  3.修改付款方的余额,-N元
	 *  4.修改收款方的余额,+N元
	 */
	@Test
	public void test6() {
		//假设付款方账号是
		String payId = "00001";
		//假设收款方账号是
		String recId = "00002";
		//假设转账金额是
		double mny = 1000.0;
		
		//由于转账是一个完整的业务,
		//所以要保证只有一个事务,
		//因此只能使用一个连接.
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			//取消自动提交事务
			conn.setAutoCommit(false);
			//1.查看付款方的余额,看够不够
			String sql = 
				"select * from accounts_lhh "
				+ "where id=?";
			PreparedStatement ps = 
				conn.prepareStatement(sql);
			ps.setString(1, payId);
			ResultSet rs = ps.executeQuery();
			rs.next();
			double payMoney = rs.getDouble("money");
			if(payMoney<mny) {
				System.out.println("余额不足");
				return;
			}
			//2.查看收款方的账号,看对不对
			String sql2 = 
				"select * from accounts_lhh "
				+ "where id=?";
			PreparedStatement ps2 = 
				conn.prepareStatement(sql2);
			ps2.setString(1, recId);
			ResultSet rs2 = ps2.executeQuery();
			if(!rs2.next()) {
				System.out.println("收款账号不存在");
				return;
			}
			double recMoney = rs2.getDouble("money");
			//3.修改付款方的余额,-N元
			String sql3 = 
				"update accounts_lhh set "
				+ "money=? where id=?";
			PreparedStatement ps3 = 
				conn.prepareStatement(sql3);
			ps3.setDouble(1, payMoney-mny);
			ps3.setString(2, payId);
			ps3.executeUpdate();
			
			Integer.valueOf("断电了");
			
			//4.修改收款方的余额,+N元
			String sql4 = 
				"update accounts_lhh set "
				+ "money=? where id=?";
			PreparedStatement ps4 = 
				conn.prepareStatement(sql4);
			ps4.setDouble(1, recMoney+mny);
			ps4.setString(2, recId);
			ps4.executeUpdate();
			//当业务完成时,提交一次事务
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			//发生异常时,让事务回滚
			DBUtil.rollback(conn);
		} finally {
			DBUtil.close(conn);
		}
	}
	
}










