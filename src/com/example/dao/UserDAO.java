package com.example.dao;

import java.util.List;

import com.example.valueobject.User;

public interface UserDAO {

	public List<User> getAllUsers();
	public User getUser(int id);
	public void updateUser(User user);
	public void deleteUser(User user);
}
