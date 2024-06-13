package com.lifeng.dao;

import java.util.List;
import com.lifeng.entity.User;

public interface UserDao {
	public void create();
	public void add(User user);
	public void delete(String id);
	public void update(User user);
	public List<User> findAllUsers();
	public User findUserById(int id);
	public int count();
}
