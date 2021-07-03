package edu.cj.javaee.day0714.service;

import java.util.List;

import edu.cj.javaee.day0714.entity.Users;

public interface UserService {
   List<Users> getAllUsers();
   Users queryUser(String name,String pass);
}
