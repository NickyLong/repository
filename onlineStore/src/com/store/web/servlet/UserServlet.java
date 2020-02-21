package com.store.web.servlet;

import com.store.domain.User;
import com.store.service.UserService;
import com.store.service.impl.UserServiceImpl;
import com.store.utils.MyBeanUtils;
import com.store.web.base.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class UserServlet extends BaseServlet {

	/**
	 * 显示注册页面
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
    public String registerUI(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       return "register.jsp";
    }

    /**
     * 注册
     * @param request
     * @param response
     * @return
     * @throws ServletException
     * @throws IOException
     * @throws SQLException 
     */
    public String regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//获取数据并封装
    	User user = new User();
    	MyBeanUtils.populate(User.class, request.getParameterMap());
    	//处理
    	UserService userService = new UserServiceImpl();
    	userService.regist(user);
    	//成功提示
    	request.setAttribute("msg", "注册成功，请登录！");
    	return "login.jsp";
    }
}
