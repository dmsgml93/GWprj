<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>joinInfoEmployee</title>
<style type="text/css">
body { background: url(img/bg-login.jpg) !important; }
.login-box{
	margin: 10px auto;
	padding : 10px;
}
#form{
	width: 500px;
	margin: 10px auto;
	border: 1px solid #ccc;
	padding: 10px;
}
/* #idP, #email, #phone, #address { */
/* 	color: Silver; */
/* } */
#head {
	text-align: center;
	font-size: 25px;
	margin-top: 80px;
}
input[type='radio']{
	margin-top: -3px;
}
</style>
</head>

<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="/resources/js/addressapi.js"></script>
<script src="js/jquery-3.3.1.min.js"></script>
<script src="./js/signup.js"></script>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<body>
	
	<div class="row-fluid">
	<div id="head">
		<h1>회원가입</h1>
	</div>
	<div class="login-box" style="width:600px;">
		<form class="form-horizontal" method="post" id="form" name="form" action="./Employee.do">
			<input type="hidden" id=chkval  value="">
	 		<div class="input-prepend">
				<br>
				<br>
	    		<label>아이디&nbsp;&nbsp;&nbsp;
				<input class="input-large" type="text" name="user_id" id="user_id"  placeholder="아이디 입력">
	    		<input type="button" onclick="check_id()" value="아이디 확인">
	    		<span id="result"></span> 
				</label>
	 		</div>
 			<div class="input-prepend">
 			<br>
    			<label>비밀번호&nbsp;&nbsp;&nbsp;
				<input class="input-large" type="password" id="user_password" name="user_password" placeholder="비밀번호">
				</label>
				<div  style="height: 15px;">
				<label id="msg1"> </label>
				</div>
 			</div>
			<div class="input-prepend">
     			<label>비밀번호 확인&nbsp;&nbsp;	
				<input class="input-large"  type="password" id="passOk" placeholder="비밀번호 확인">
				<input type="button" onclick="check_pw()" value="비밀번호 확인">
				</label>
				<div  style="height: 15px;">
				<label id="msg2"> </label>
				</div>
  			</div>	
  			<div class="input-prepend">
  			<br>
     			<label>성명&nbsp;&nbsp;&nbsp;&nbsp;
     			<input type="text" class="input-large" id="user_name" name="user_name" placeholder="성명">
  				</label>
  			</div>
			<div class="input-prepend" style="display: none;">
     			<label>타입</label>	
				<input class="form-control" type="text" id="user_type" name="user_type" value=${user_type}>
			</div>
			<div class="input-prepend">
			<br>
     			<label>이메일&nbsp;&nbsp;&nbsp;&nbsp;	
   				<input type="text" class="input-large" id="user_email" name="user_email" placeholder="이메일 입력"  >
   				 <input type="button" value="email 체크"  onclick="emailCheck()">
   				 </label> 
			</div>  
			<div class="input-prepend">
			<br>
     			<label>휴대전화&nbsp;&nbsp;&nbsp;
     			<input type="text" class="input-large" id="user_phone" name="user_phone" placeholder="휴대전화 입력(-포함)"> 
     			</label> 	
			</div>
			<div class="input-prepend">
			<br>
     			<label>주소&nbsp;&nbsp;&nbsp;&nbsp;              
				<input class="form-control" style="width: 40%; display: inline;" placeholder="우편번호" name="addr1" id="addr1" type="text" readonly="readonly" >
			    <button type="button" class="btn btn-default" onclick="execPostCode();">
			    <i class="fa fa-search"></i> 우편번호 찾기</button>                               
			    <input class="form-control" style="top: 5px;" placeholder="도로명 주소" name="user_address" id="user_address" type="text" readonly="readonly" />
				<input class="form-control" placeholder="상세주소" name="addr3" id="addr3" type="text"  />
				</label>	
			</div>
			<div class="input-prepend">	
			<br>
				<label> 생년월일&nbsp;&nbsp;&nbsp;&nbsp;
					<input class="input-large" type="date" id="user_birth" name="user_birth" style="margin-top: 5px;">
				</label>
			</div>
			<div class="input-prepend">
			<br>
				<label>성별 선택&nbsp;&nbsp;&nbsp;&nbsp; 
					<input type="radio" name="user_gender" value="F" checked="checked" style="margin-top: -3px;"> 여
					<input type="radio" name="user_gender" value="M" style="margin-top: -3px;"> 남
				</label>
			</div>
			<div class="input-prepend"> 
			<br>
				<label>이메일 수신동의 선택&nbsp;&nbsp;&nbsp;&nbsp; 
					<input type="radio" name="user_eagree" value="Y" checked="checked" style="margin-top: -3px;"> 예
					<input type="radio" name="user_eagree" value="N" style="margin-top: -3px;"> 아니오
				</label>
			</div>	

			<div class="input-prepend" id="botton" style="text-align: center">
			<br>
			<label>
				<button type="submit" class="btn btn-primary" onclick="check()">회원가입</button>&nbsp;&nbsp;
				<input type="button" class="btn btn-basic" value="돌아가기" onclick="javascript:history.back(-1)">
			</label>
			</div>
			<br>
		</form>
		</div>
	</div>
</body>
</html>