package com.zbl.score.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zbl.score.dao.UserDao;
import com.zbl.score.entity.User;
import com.zbl.score.service.UserService;



@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao userDao;
	
	public User login(User user) throws Exception {
		return userDao.login(user);
	}

}
