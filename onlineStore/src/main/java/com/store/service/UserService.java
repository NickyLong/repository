package com.store.service;

import java.sql.SQLException;

import com.store.domain.User;

public interface UserService {

	public boolean regist(User user) throws SQLException;

	public Boolean check(String name) throws SQLException;
}
