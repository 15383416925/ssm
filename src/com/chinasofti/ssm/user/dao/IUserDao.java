package com.chinasofti.ssm.user.dao;

import com.chinasofti.ssm.user.entity.EUser;


public interface IUserDao {
	public boolean userRegister(EUser user);
	public EUser userLogin(EUser user);
}
