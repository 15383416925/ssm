package com.chinasofti.ssm.user.dao.impl;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chinasofti.ssm.user.dao.IUserDao;
import com.chinasofti.ssm.user.entity.EUser;
@Repository
public class UserDaoImpl implements IUserDao {
	private int i=0;
	private boolean flag=false;
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	

	@Override
	public boolean userRegister(EUser user) {
		i = this.sqlSessionTemplate.insert("userMapper.usergister", user);
		if(i==1){
			flag = true;
		}
		return flag;
	}


	@Override
	public EUser userLogin(EUser user) {
		System.out.println(user);
		EUser uuser = this.sqlSessionTemplate.selectOne("userMapper.userlogin", user);
		System.out.println(uuser);
		return uuser;
	}

}
