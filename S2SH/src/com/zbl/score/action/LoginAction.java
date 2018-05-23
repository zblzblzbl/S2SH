package com.zbl.score.action;

import javax.annotation.Resource;

import com.zbl.score.entity.User;
import com.zbl.score.service.UserService;
public class LoginAction {
	@Resource
	private UserService userService;
	
	private User user;
	private String userName;
	private String password;

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	
}
