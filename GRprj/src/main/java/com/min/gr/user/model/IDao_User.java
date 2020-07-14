package com.min.gr.user.model;


import com.min.gr.user.dto.UserInfoDTO;
import com.min.gr.user.dto.UserLoginDTO;

public interface IDao_User {
	
	public UserInfoDTO info(String user_id);
	
	public UserLoginDTO login(String user_id);
//	����� ȸ������ (���������Է�)
	public boolean joinInfoEmployer(UserLoginDTO dto);
	
//	�Ϲ����� ȸ������ (���������Է�) 
	public boolean joinInfoEmployee(UserLoginDTO dto);
	
//	���̵� �ߺ��˻�
//	��й�ȣ ã�� �� ���̵� Ȯ�����ε� ���
	public String idChk(String user_id);
	
//	�޴��� �ߺ��˻�
	public String duplChkPhone(String user_phone);
	
//	�̸��� �ߺ��˻�
	public String duplChkEmail(String user_email);

}