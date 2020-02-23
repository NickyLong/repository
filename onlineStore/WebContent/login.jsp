<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/login.js"></script>
<title>登录页</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/UserServlet?method=login" method="post" name="form_login">
		<input type="text" id="name" name="name" placeholder="请输入用户名" required="required"><br>
		<input type="password" id="psw" name="psw" placeholder="请输入密码" required="required"><br>
	</form>
    <table>
    	<tr>
	        <td><button onclick="check()">登录</button></td>
            <td>
                <a href="register.jsp" target="_blank"><button>注册</button></a>
            </td>
        </tr>
    </table>
</body>
</html>