package com.qlc.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qlc.sms.model.User;
import com.qlc.sms.service.LoginService;

@Controller

public class LoginController {
	LoginService loginservice;
	
	@RequestMapping(value="/login.do" ,method=RequestMethod.POST)
	public ModelAndView logindo(@ModelAttribute("user") User user) {
		String name=user.getName();
		ModelAndView mv=new ModelAndView();
		if(true) {
			mv.addObject("user", user);
			mv.setViewName("UserPage");
		}
		else if (false) {
			mv.setViewName("AdminPage");
		}
		else {
			mv.setViewName("Loginfailed");
		}
		return mv;
	}
	
	@RequestMapping("/register")
	public String regist() {
		return "RegisterPage";
	}

}
