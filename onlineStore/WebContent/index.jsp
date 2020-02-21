<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
<body>
    <table>
        <tr>
            <td>username</td>
            <td>
                <input type="text" name="username" id="username">
            </td>
        </tr>
        <tr>
            <td>password</td>
            <td>
                <input type="password" name="password" id="password">
            </td>
        </tr>
    </table>
    <table>
        <tr>
            <td>
                <button onclick="login()">login</button>
                
            </td>
            <td>
                <button><a href="${pageContext.request.contextPath}/UserServlet?method=registerUI" target="_blank">register</a></button>
            </td>
        </tr>
    </table>
</body>
</html>