package edu.cj.javaee.day0714.service.impl;

import java.util.List;

import edu.cj.javaee.day0714.dao.UserDAO;
import edu.cj.javaee.day0714.dao.impl.UsersDAOImpl;
import edu.cj.javaee.day0714.entity.Users;
import edu.cj.javaee.day0714.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDAO dao;
    public UserServiceImpl(){
    	this.dao = new UsersDAOImpl();
    }
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	public Users queryUser(String name, String pass) {
		// TODO Auto-generated method stub
		return dao.queryUser(name, pass);
	}

}
