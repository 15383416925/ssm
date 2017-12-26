package com.chinasofti.ssm.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasofti.ssm.user.dao.IUserDao;
import com.chinasofti.ssm.user.entity.EUser;
import com.chinasofti.ssm.user.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	//注入DAO
	@Autowired
	IUserDao iUserDao;

	@Override
	@Transactional
	public boolean userRegister(EUser user) {
		// TODO Auto-generated method stub
		return iUserDao.userRegister(user);
	}

	@Override
	public EUser userLogin(EUser user) {
		// TODO Auto-generated method stub
		return iUserDao.userLogin(user);
	}

}
