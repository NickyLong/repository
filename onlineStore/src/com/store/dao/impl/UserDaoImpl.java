package com.store.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.store.dao.UserDao;
import com.store.domain.User;
import com.store.utils.JdbcUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(User user) throws SQLException {
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "insert into user_info(user_id,user_name,password,phone,email) values (?,?,?,?,?)";
		Object[] params = {user.getUid(), user.getName(), user.getPsw(), user.getPhone(), user.getEmail()};
		qr.update(sql,params);
	}
}
