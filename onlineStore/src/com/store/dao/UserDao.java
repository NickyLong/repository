package com.store.dao;

import java.sql.SQLException;

import com.store.domain.User;

public interface UserDao {

	public int save(User user) throws SQLException;

	public Long check(String name) throws SQLException;

}
