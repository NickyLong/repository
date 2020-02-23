package com.store.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.store.dao.UserDao;
import com.store.domain.User;
import com.store.utils.JdbcUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public int save(User user) throws SQLException{
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "insert into user_info(user_id,user_name,password,phone,email) values (?,?,?,?,?)";
		Object[] params = {user.getUid(), user.getName(), user.getPsw(), user.getPhone(), user.getEmail()};
		int update = qr.update(sql,params);
		return update;
	}

	public Long check(String name) throws SQLException {
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "select count(*) from user_info where user_name = ? ";
		Long num = (Long)qr.query(sql, new ScalarHandler(), name);
		return num;
	}

	
}
