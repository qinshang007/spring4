package com.spring4.dao;

import com.spring4.model.User;

public interface UserDao {
	
	 /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
    
}
