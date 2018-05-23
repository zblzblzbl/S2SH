package com.zbl.score.dao;

import com.zbl.score.entity.User;



public interface UserDao {

	public User login(User user) throws Exception;
}
