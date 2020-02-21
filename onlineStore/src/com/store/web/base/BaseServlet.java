package com.store.web.base;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String methodName = req.getParameter("method");
            if(methodName ==  null){
                methodName = "execute";
            }
            Method method = this.getClass().getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            String jspPath = (String)method.invoke(this, req, resp);
            if(jspPath != null){
                req.getRequestDispatcher(jspPath).forward(req, resp);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        return null;
    }

}
