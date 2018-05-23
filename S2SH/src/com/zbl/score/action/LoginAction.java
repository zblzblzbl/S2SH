package com.zbl.score.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ActionSupport;
import com.zbl.score.entity.User;
import com.zbl.score.service.UserService;
public class LoginAction extends ActionSupport implements ServletRequestAware{
	private static final long serialVersionUID = 1L;
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

	@Override
	public String execute() throws Exception {
//		User user = new User();
//		user.setUserName(userName);
//		user.setPassword(password);
	User u;
	try {
		u = userService.login(user);
		if(u==null){
			return "input";
		}else{
			
			return "success";
		}
			
	} catch (Exception e) {
		e.printStackTrace();
		return "input";
	}
	}
	

	public void setServletRequest(HttpServletRequest arg0) {
		
		
	}


	
}
