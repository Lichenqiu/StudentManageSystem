package com.qlc.sms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qlc.sms.model.User;

@Repository
public interface userMapper {
	public void insertUser(User User);
	public void deleteUser(int id);
	public User selectbyname(String name);
	public List<User> queryAll();
	public void updateUser(User user);


}
