package com.domain.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.backend.dao.UserDao;
import com.domain.backend.model.User;
import com.domain.backend.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User save(User user) {
		return userDao.save(user);
	}

	public User findByUserName(String username) {
		return userDao.findByUserName(username);
	}
}
