package day0719.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import day0719.dao.WareDAO;
import day0719.entity.Ware;
import edu.cj.javaee.day0714.utils.JdbcUtils;

public class WareDAOImpl extends JdbcUtils implements WareDAO {

	public Ware getWareByName(String wareName) {
		Ware w = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from ware where wareName = ?";
		conn = getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, wareName);
			rs = ps.executeQuery();
			if (rs.next()) {
				w = new Ware(rs.getString(1), rs.getInt(2), rs.getInt(3));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			closeAll(rs, ps, conn);
		}
		return w;
	}

	public int addWre(Ware w) {
		int result = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "insert into ware values(?,?,?)";
		conn = getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, w.getWareName());
			ps.setInt(2, w.getWareSort());
			ps.setInt(3, w.getWareAmount());
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			closeAll(rs, ps, conn);
		}
		return result;
	}

	public int updateWare(Ware w) {
		int result = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "update ware set wareAmount = wareAmount+? where wareName = ?";
		conn = getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, w.getWareAmount());
			ps.setString(2, w.getWareName());
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			closeAll(rs, ps, conn);
		}
		return result;
	}

}
