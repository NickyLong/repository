function init(){}

init();

/**
 * 注册
 */
function regist(){
	if(!check()){
		return;
	}else{
		document.form_regist.submit();
	}
}

function check(){
	var name = document.form_regist.name.value;
	var psw = document.form_regist.psw.value;
	var confim_psw = document.form_regist.confirm_psw.value;
	var phone = document.form_regist.phone.value;
	var email = document.form_regist.email.value;
	if(name == null || name == ""){
		alert("用户名不能为空！");
		return false;
	}
	if(psw == null || psw == ""){
		alert("密码不能为空！");
		return false;
	}
	if(pw != confirm_psw){
		alert("两次输入的密码不一致，请重新输入");
		document.psw.value = "";
		document.confim_psw.value = "";
		return false;
	}
	if(phone == null || phone == ""){
		alert("手机号不能为空！");
		return false;
	}
	if(email == null || email == ""){
		alert("邮箱不能为空！");
		return false;
	}
	return true;
}
