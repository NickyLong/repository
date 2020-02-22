package com.store.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.store.domain.User;
import com.store.service.UserService;
import com.store.service.impl.UserServiceImpl;
import com.store.utils.CommonsUtils;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		//获得表单数据
		Map<String, String[]> properties = request.getParameterMap();
		User user = new User();
		//映射封装
		try {
			BeanUtils.populate(user, properties);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user.setUid(CommonsUtils.getUUID());
		
		UserService service = new UserServiceImpl();
		boolean isRegisterSuccess = false;
		try {
			isRegisterSuccess = service.regist(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(isRegisterSuccess){
			response.sendRedirect(request.getContextPath() + "/registerSuccess.jsp");
		}else{
			response.sendRedirect(request.getContextPath() + "/registerFail.jsp");
	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
