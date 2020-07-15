<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인</title>
</head>
<script type="text/javascript">
	function valChk() {
		var user = document.getElementById("user");
		var pw = document.getElementById("pw");
		if (user.value == "") {
			document.getElementById("err").innerHTML = "";
			document.getElementById("msg").innerHTML = "아이디를 입력해 주세요.";
			return false;
		} else if (pw.value == "") {
			document.getElementById("err").innerHTML = "";
			document.getElementById("msg").innerHTML = "비밀번호를 입력해 주세요.";
			return false;
		}
		return true;
	}
</script>
<body>
	<form data-uc-form action="./result.do" method="POST">
		<input type="text" name="id" placeholder="아이디"
			style="border-color: #777676;" /> <input type="text" name="password"
			placeholder="비밀번호" style="border-color: #777676;" />

		<button type="submit">로그인</button>
	</form>
	<a href="./joinInfoEmployee.do" data-uc-click="modal" > 회원가입</a>

	<a href="" class="is-txt-link">ID찾기</a>
	<a href="" class="is-txt-link">비밀번호 찾기</a>
</body>
</html>