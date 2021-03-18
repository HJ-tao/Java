package edu.cj.javaee.day0714.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.cj.javaee.day0714.dao.TrainDAO;
import edu.cj.javaee.day0714.entity.Train;
import edu.cj.javaee.day0714.utils.JdbcUtils;

public class TrainDAOImpl extends JdbcUtils implements TrainDAO {

	public List<Train> getAllTrains() {
		List<Train> list = new ArrayList<Train>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		conn = getConn(); //��ȡ���Ӷ���
		
		String sql = "select * from train_info ";
		
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				//��װ��ѯ�������ݱ����Ӧ��entity�������
				Train t = new Train();
					getTrain(rs, t);			
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

	private void getTrain(ResultSet rs, Train t) throws SQLException {
		t.setTrainNo(rs.getString(1));
		t.setStartStation(rs.getString(2));
		t.setArrivalStation(rs.getString(3));
		t.setStartTime(rs.getString(4));
		t.setArrivalTime(rs.getString(5));
		t.setType(rs.getString(6));
		t.setRuntime(rs.getString(7));
		t.setMile(rs.getFloat(8));
	}

	public Train getTrainByNo(String no) {
		// TODO Auto-generated method stub
		return null;
	}

	public int addTrain(Train t) {
		int result = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		conn = getConn(); //��ȡ���Ӷ���
		
		String sql = "insert into train_info values(?,?,?,?,?,?,?,?) ";
		
		try {
			ps = conn.prepareStatement(sql);
			//Ϊ��Ӧ��"��"��ֵ
			ps.setString(1, t.getTrainNo());
			ps.setString(2, t.getStartStation());
			ps.setString(3, t.getArrivalStation());
			ps.setString(4, t.getStartTime());
			ps.setString(5, t.getArrivalTime());
			ps.setString(6, t.getType());
			ps.setString(7, t.getRuntime());
			ps.setFloat(8, t.getMile());
			result = ps.executeUpdate();
		    
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			closeAll(rs, ps, conn);
		}
		
		return result;
	}

	public boolean deleteTrainByNo(String no) {
		// TODO Auto-generated method stub
		return false;
	}

	public int updateTrain(Train t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
