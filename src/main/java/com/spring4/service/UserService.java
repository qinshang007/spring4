package com.spring4.service;

import com.spring4.model.User;

public interface UserService {
	
	 /**
     * 添加新用户
     * @param user
     * @return
     */
	public int insertUser(User user);
	
}
