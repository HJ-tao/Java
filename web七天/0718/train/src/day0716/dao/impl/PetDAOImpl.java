package day0716.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day0716.dao.PetDAO;
import day0716.entity.Pet;
import edu.cj.javaee.day0714.utils.JdbcUtils;

public class PetDAOImpl extends JdbcUtils implements PetDAO {

	public List<Pet> queryAllPets() {
		// TODO Auto-generated method stub
		return null;
	}

	public Pet getPetById(int pId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int addPet(Pet p) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addPetType(String pType) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getAllPType() {
		StringBuilder sb = new StringBuilder();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		conn = getConn();
		String sql = "select * from pType order by pTypeId";
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				sb.append(rs.getString(2)).append(",");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			closeAll(rs, ps, conn);
		}
		return sb.deleteCharAt(sb.length()-1).toString();
	}

	public Map<Integer, String> getPType() {
		Map<Integer, String> types = new HashMap<Integer, String>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		conn = getConn();
		String sql = "select * from pType order by pTypeId";
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				types.put(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			closeAll(rs, ps, conn);
		}
		return types;
	}

}
