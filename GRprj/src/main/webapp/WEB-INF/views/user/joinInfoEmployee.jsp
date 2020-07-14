<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>joinInfoEmployee</title>
</head>
<body>
	
	<div class="row-fluid">
	<div id="head">
		<h1>회원가입</h1>
	</div>
	<div class="login-box" style="width:600px;">
		<form class="form-horizontal" method="post" id="form" name="form" action="./Employee.do">
			<input type="hidden" id="confmKey" name="confmKey" value="">
 			<div class="input-prepend">
			<br>
			<br>
    			<label>아이디&nbsp;&nbsp;&nbsp;
				<input class="input-large" type="text" name="user_id" id="user_id" readonly="readonly" placeholder="아이디 입력">
    			<input class="btn btn-basic" type="button" value="중복 확인" onclick="idChk();" style="margin-bottom : 5px;">
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
   				<input type="text" class="input-large" id="user_email" name="user_email" placeholder="이메일 입력" readonly="readonly">
   				<input class="btn btn-basic" type="button" value="인증하기" onclick="emailChk();" style="margin-bottom : 5px;">
				</label> 
			</div>  
			<div class="input-prepend">
			<br>
     			<label>휴대전화&nbsp;&nbsp;&nbsp;
     			<input type="text" class="input-large" id="user_phone" name="user_phone" placeholder="휴대전화 입력(-포함)" readonly="readonly"> 
     			<input class="btn btn-basic" type="button" value="인증하기" onclick="phoneChk();" style="margin-bottom : 5px;">
				</label> 	
			</div>
			<div class="input-prepend">
			<br>
     			<label>주소&nbsp;&nbsp;&nbsp;&nbsp;
				<input class="input-large span8" type="text" id="user_address" name="user_address" readonly="readonly" placeholder="주소 입력"/> 
				<input class="btn btn-basic" type="button" value="주소 검색" onclick="goPopup();" style="margin-bottom : 5px;">
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
			<div class="input-prepend">		
			<br>
				<label>SMS 수신동의 선택&nbsp;&nbsp;&nbsp;&nbsp; 
					<input type="radio" name="user_sagree" value="Y" checked="checked" style="margin-top: -3px;"> 예
					<input type="radio" name="user_sagree" value="N" style="margin-top: -3px;"> 아니오
				</label>
			<br>	
			</div>	
			<div class="input-prepend" id="botton" style="text-align: center">
			<br>
			<label>
				<input id="signUp" type="button" class="btn btn-primary" value="회원가입">&nbsp;&nbsp;
				<input type="button" class="btn btn-basic" value="돌아가기" onclick="javascript:history.back(-1)">
			</label>
			</div>
			<br>
		</form>
		</div>
	</div>
</body>
</html>