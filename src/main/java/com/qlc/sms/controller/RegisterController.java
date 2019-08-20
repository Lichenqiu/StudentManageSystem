package com.qlc.sms.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qlc.sms.dao.UserDao;
import com.qlc.sms.model.User;
import com.qlc.sms.service.IRegisterService;
import com.qlc.sms.service.RegisterService;

@Controller
public class RegisterController {
	
	@Resource
	IRegisterService IRegisterService;
	
	@RequestMapping(value="/register.do" ,method=RequestMethod.POST)
	public String registdo(@ModelAttribute("user") User user) {
		user.setPosition("USER");
		System.out.println(user.getName()+user.getAge()+user.getPassword()+user.getPosition());
		IRegisterService.insertUser(user);
		return "Success";
	}

}
