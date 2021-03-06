package com.min.gr.user.model;

import com.min.gr.user.dto.UserInfoDTO;
import com.min.gr.user.dto.UserLoginDTO;

public interface IService_User {

	public UserLoginDTO login(String user_id);
	
	public UserInfoDTO info(String user_id);

//	����� ȸ������ (���������Է�)
	public boolean joinInfoEmployer(UserInfoDTO dto);
	
//	�Ϲ����� ȸ������ (���������Է�) 
	public boolean joinInfoEmployee(UserInfoDTO dto);
	
//	���̵� �ߺ��˻�
//	��й�ȣ ã�� �� ���̵� Ȯ�����ε� ���
	public boolean idDuplicateCheck(String user_id);
	
//	�޴��� �ߺ��˻�
	public String duplChkPhone(String user_phone);
	
//	�̸��� �ߺ��˻�
	public String duplChkEmail(String user_email);

}
