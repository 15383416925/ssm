package com.chinasofti.ssm.user.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinasofti.ssm.user.entity.EUser;
import com.chinasofti.ssm.user.service.IUserService;
@Controller
@RequestMapping("reqs")
public class UserHandler {
	//注入Service
	@Autowired
	IUserService iUserService;
	
	@RequestMapping("/usergister")
	public String userHandler(EUser user){
		iUserService.userRegister(user);
		return "redirect:/userlogin.jsp";
	}
	
	@RequestMapping("/login")
	public String userLogin(EUser user){
		
		EUser userLogin = iUserService.userLogin(user);
		if (userLogin!=null&&!userLogin.equals("")) {
			
			return "redirect:/success.jsp";
		}
		return "redirect:/userlogin.jsp";
	}
}
