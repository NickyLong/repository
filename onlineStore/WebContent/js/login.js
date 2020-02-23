function init(){
	
}

init();

/**
 * 非空判断
 */
function check(){
	var username = document.form_login.name.value;
	var password = document.form_login.psw.value;
	if(username == null || username == ""){
		alert("用户名不能为空！");
		return;
	}
	if(password == null || password == ""){
		alert("密码不能为空！");
		return;
	}
	document.form_login.submit();
}

