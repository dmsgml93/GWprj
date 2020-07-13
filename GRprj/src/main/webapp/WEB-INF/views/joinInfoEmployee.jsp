<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>joinInfoEmployee</title>
</head>
<body>
	<form action="./Employee.do" method="post">

		<input type="text" name="selpick" placeholder="* 사업자등록증이미지" id="selpick" /> 
		
		<input class="form-control" type="text" name="id"	id="id" placeholder="* 아이디" maxlength="20">
		<br> <span id="result"></span> 
		
		<input type="text" name="pw" placeholder="* 비밀번호" id="pw">
		
		<input class="form-control" type="password"	id="passOk" placeholder="* 비밀번호 확인">
		<br> <span	id="result_pw"></span> 
		<input type="text" name="name"	placeholder="* 이름" id="name"> 
		
		<input type="text"	name="address" placeholder="* 주소"> 
		
		<input type="text"	name="nicname" placeholder="* 별명"> 
		
		<input type="text" id="sellernum" name="sellernum" placeholder="* 사업자번호" maxlength="20">
		<span id="result"></span> 
		
		<input type="text" name="email" id="email"	placeholder="* 이메일">
		
		<button type="submit" class="is-btn-yg1 is-mg-b_15" onclick="check()">회원가입</button>

	</form>
</body>
</html>