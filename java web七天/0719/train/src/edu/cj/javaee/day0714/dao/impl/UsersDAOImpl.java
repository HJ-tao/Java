package edu.cj.javaee.day0714.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.cj.javaee.day0714.dao.UserDAO;
import edu.cj.javaee.day0714.entity.Train;
import edu.cj.javaee.day0714.entity.Users;
import edu.cj.javaee.day0714.utils.JdbcUtils;

public class UsersDAOImpl extends JdbcUtils implements UserDAO{

	public List<Users> getAllUsers() {
		List<Users> list = new ArrayList<Users>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		conn = getConn(); //��ȡ���Ӷ���
		
		String sql = "select * from users ";
		
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				//��װ��ѯ�������ݱ����Ӧ��entity�������
				Users t = new Users(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
							
				//�ǵý���װ���ʵ���������ӵ�������ȥ
				list.add(t);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			closeAll(rs, ps, conn);
		}
		
		return list;
		
	}

	public Users queryUser(String name, String pass) {
		Users u = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		conn = getConn(); //��ȡ���Ӷ���
		
		String sql = "select * from users where userNAME = ? AND USERPASS = ? ";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				//��װ��ѯ�������ݱ����Ӧ��entity�������
				 u = new Users(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			closeAll(rs, ps, conn);
		}
		
		return u;
	}

}
