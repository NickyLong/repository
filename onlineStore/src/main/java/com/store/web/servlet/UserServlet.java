package com.store.web.servlet;

import com.store.domain.User;
import com.store.service.UserService;
import com.store.service.impl.UserServiceImpl;
import com.store.web.base.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

public class UserServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 登录
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String name = request.getParameter("name");
		//判断用户名是否存在
		UserService service = new UserServiceImpl();
		Boolean isExist = false;
		try {
			isExist = service.check(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!isExist){
			response.getWriter().write("login fail");
		}else{
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		}
    }

}
