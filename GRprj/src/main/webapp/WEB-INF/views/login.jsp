<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인</title>
</head>
<script type="text/javascript">
function valChk(){
	var user = document.getElementById("user");
	var pw = document.getElementById("pw");
	if(user.value == ""){
		document.getElementById("err").innerHTML = "";
		document.getElementById("msg").innerHTML = "아이디를 입력해 주세요.";
		return false;
	}else if(pw.value == ""){
		document.getElementById("err").innerHTML = "";
		document.getElementById("msg").innerHTML = "비밀번호를 입력해 주세요.";
		return false;
	}
	return true;
}
</script>
<body>



</body>
</html>