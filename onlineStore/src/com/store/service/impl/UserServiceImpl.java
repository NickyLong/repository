package com.store.service.impl;

import java.sql.SQLException;

import com.store.dao.UserDao;
import com.store.dao.impl.UserDaoImpl;
import com.store.domain.User;
import com.store.service.UserService;

public class UserServiceImpl implements UserService {

	/**
	 * 注册
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	@Override
	public boolean regist(User user) throws SQLException {
		UserDao userDao = new UserDaoImpl();
		int row = userDao.save(user);
		return row > 0 ? true : false;
	}

	//测试jenkins
	/**
	 * 检测用户名是否存在
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	@Override
	public Boolean check(String name) throws SQLException {
		UserDao userDao = new UserDaoImpl();
		Long num = userDao.check(name);
		return num > 0 ? true : false;
	}
}
