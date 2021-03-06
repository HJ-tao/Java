package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import dao.EmpDao;
import entity.Emp;
import util.DBUtil;

public class TestDay03 {

	/**
	 * 批量添加108个员工
	 */
	@Test
	public void test1() {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);
			String sql = 
				"insert into emps_lhh values("
				+ "emps_seq_lhh.nextval,"
				+ "?,?,?,?,?,?,?)";
			PreparedStatement ps = 
				conn.prepareStatement(sql);
			for(int i=1;i<=108;i++) {
				//给?赋值
				ps.setString(1, "好汉"+i);
				ps.setString(2, "打劫");
				ps.setInt(3, 0);
				ps.setDate(4, new Date(
					System.currentTimeMillis()));
				ps.setDouble(5, 6000.0);
				ps.setDouble(6, 8000.0);
				ps.setInt(7, 10);
				//将本条数据暂存到ps上
				ps.addBatch();
				//每50条数据发送一次
				if(i%50==0) {
					//将ps上暂存的数据发送给DB
					ps.executeBatch();
					//清空ps上的数据,以便于下次发送
					ps.clearBatch();
				}
			}
			//为避免有零头数据,再单独发送一次
			ps.executeBatch();
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			DBUtil.rollback(conn);
		} finally {
			DBUtil.close(conn);
		}
	}
	
	/**
	 * 先增加一个部门,
	 * 再给这个部门增加一个员工.
	 */
	@Test
	public void test2() {
		//假设用户输入的部门数据是
		String dname = "测试部";
		String loc = "深圳";
		//假设用户输入的员工数据是
		String ename = "张飞";
		String job = "测试经理";
		int mgr = 0;
		Date hiredate = new Date(
			System.currentTimeMillis());
		double sal = 9000.0;
		double comm = 3000.0;
		
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);
			//增加部门
			String sql = 
				"insert into depts_lhh values("
				+ "depts_seq_lhh.nextval,?,?)";
			//参数2中写上你希望ps返回的主键字段名.
			PreparedStatement ps = 
				conn.prepareStatement(
					sql, new String[]{"deptno"});
			ps.setString(1, dname);
			ps.setString(2, loc);
			ps.executeUpdate();
			//获取自动生成的部门ID
			//返回的结果集中包含一行数据,
			//刚才要求ps返回几列,则结果集
			//中就包含这几列的值.
			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			//从此结果集中取数,必须通过序号来取
			int deptno = rs.getInt(1);
			//增加员工
			sql = "insert into emps_lhh values("
				+ "emps_seq_lhh.nextval,"
				+ "?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, ename);
			ps.setString(2, job);
			ps.setInt(3, mgr);
			ps.setDate(4, hiredate);
			ps.setDouble(5, sal);
			ps.setDouble(6, comm);
			ps.setInt(7, deptno);
			ps.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			DBUtil.rollback(conn);
		} finally {
			DBUtil.close(conn);
		}
	}
	
	/**
	 * 分页查询员工
	 */
	@Test
	public void test3() {
		//假设用户点击了第3页
		int page = 3;
		//假设需求规定了每页显示10条数据
		int size = 10;
		
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = 
				"select * from ("
				+ "	select e.*,rownum r from("
				+ "	  select * from emps_lhh "
				+ "	  order by empno"
				+ "	) e"
				+ ") where r between ? and ?";
			PreparedStatement ps = 
				conn.prepareStatement(sql);
			ps.setInt(1, (page-1)*size+1);
			ps.setInt(2, page*size);
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
	 * 测试EmpDao.findById()
	 * 测试EmpDao.update()
	 */
	@Test
	public void test4() {
		EmpDao dao = new EmpDao();
		Emp e = dao.findById(1);
		System.out.println(e);
		e.setEname("张三丰");
		dao.update(e);
	}
	
}












