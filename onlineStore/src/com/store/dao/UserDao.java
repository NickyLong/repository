package com.store.dao;

import java.sql.SQLException;

import com.store.domain.User;

public interface UserDao {

	public void save(User user) throws SQLException;

}
