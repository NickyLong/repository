package com.store.service.impl;

import java.sql.SQLException;

import com.store.dao.UserDao;
import com.store.dao.impl.UserDaoImpl;
import com.store.domain.User;
import com.store.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void regist(User user) throws SQLException {
		UserDao userDao = new UserDaoImpl();
		userDao.save(user);
		
	}
}
