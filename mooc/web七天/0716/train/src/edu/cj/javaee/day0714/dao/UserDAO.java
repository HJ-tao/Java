package edu.cj.javaee.day0714.dao;

import java.util.List;

import edu.cj.javaee.day0714.entity.Users;

public interface UserDAO {
   List<Users> getAllUsers();
   Users queryUser(String name,String pass);
}
