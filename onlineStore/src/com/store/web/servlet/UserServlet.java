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
	 * ��ʾע��ҳ��
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
     * ע��
     * @param request
     * @param response
     * @return
     * @throws ServletException
     * @throws IOException
     * @throws SQLException 
     */
    public String regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//��ȡ���ݲ���װ
    	User user = new User();
    	MyBeanUtils.populate(User.class, request.getParameterMap());
    	//����
    	UserService userService = new UserServiceImpl();
    	userService.regist(user);
    	//�ɹ���ʾ
    	request.setAttribute("msg", "ע��ɹ������¼��");
    	return "login.jsp";
    }
}
