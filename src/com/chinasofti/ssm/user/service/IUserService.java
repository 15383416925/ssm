package com.chinasofti.ssm.user.service;


import com.chinasofti.ssm.user.entity.EUser;

public interface IUserService {
	public boolean userRegister(EUser user);
	public EUser userLogin(EUser user);
}
