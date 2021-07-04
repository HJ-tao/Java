package day0716.test;

import day0716.dao.PetDAO;
import day0716.dao.impl.PetDAOImpl;

public class TestPet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PetDAO dao = new PetDAOImpl();
		String types = dao.getAllPType();
		//System.out.println(types);
		System.out.println(dao.getPType());

	}

}
