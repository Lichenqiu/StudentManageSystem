package com.qlc.sms.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qlc.sms.dao.UserDao;
import com.qlc.sms.dao.userMapper;
import com.qlc.sms.model.User;


@Service("RegistService")
public class RegisterService implements IRegisterService{
	
	@Resource
	private userMapper userMapper;
	
	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
		System.out.println("insert complete!");
	}

	
}
