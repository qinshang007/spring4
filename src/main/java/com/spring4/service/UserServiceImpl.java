package com.spring4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring4.dao.UserDao;
import com.spring4.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	 /**
     * 添加新用户
     * @param user
     * @return
     */
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

}
