package com.store.service;

import java.sql.SQLException;

import com.store.domain.User;

public interface UserService {

	public void regist(User user) throws SQLException;
}
