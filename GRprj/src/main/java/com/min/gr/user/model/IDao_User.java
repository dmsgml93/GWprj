package com.min.gr.user.model;


import com.min.gr.user.dto.UserInfoDTO;
import com.min.gr.user.dto.UserLoginDTO;

public interface IDao_User {
	
	public UserInfoDTO info(String user_id);
	
	public UserLoginDTO login(String user_id);
//	����� ȸ������ (���������Է�)
	public boolean joinInfoEmployer(UserInfoDTO dto);
	
//	�Ϲ����� ȸ������ (���������Է�) 
	public boolean joinInfoEmployee(UserInfoDTO dto);
	
	/**
	 * 아이디 중복 검사(idDuplicateCheck)
	 * 
	 * @param 중복확인값
	 * @return 사용가능 여부(true 사용가능)
	 */
	public boolean idDuplicateCheck(String user_id);
	
//	�޴��� �ߺ��˻�
	public String duplChkPhone(String user_phone);
	
//	�̸��� �ߺ��˻�
	public String duplChkEmail(String user_email);

}
