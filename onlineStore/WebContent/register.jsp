<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/regist.js"></script>
<title>注册页面</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/RegisterServlet" method="post" name="form_regist">
    	<input type="text" name="name" placeholder="请输入用户名" required="required"><br>
    	<input type="password" name="psw" placeholder="请输入密码" required="required"><br>
    	<input type="password" name="confirm_psw" placeholder="请确认密码" required="required"><br>
    	<input type="text" name="phone" placeholder="请输入手机号" required="required"><br>
    	<input type="text" name="email" placeholder="请输入邮箱" required="required"><br>
    	<input type="hidden" name="regist_error" value="<%=request.getAttribute("regist_error") %>>">
    </form>
    <button onclick="regist()">提交</button>
</body>
</html>