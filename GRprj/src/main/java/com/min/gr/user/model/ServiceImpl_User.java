package com.min.gr.user.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.gr.user.dto.UserInfoDTO;
import com.min.gr.user.dto.UserLoginDTO;

@Service
public class ServiceImpl_User implements IService_User {

	@Autowired
	private IDao_User dao;
	
	@Override
	public boolean joinInfoEmployer(UserInfoDTO dto) {
		System.out.println("ServiceImpl>>"+dto+"joinInfoEmployer");
		return dao.joinInfoEmployer(dto);
	}

	@Override
	public boolean joinInfoEmployee(UserInfoDTO dto) {
		System.out.println("ServiceImpl>>"+dto+"joinInfoEmployee");
		return dao.joinInfoEmployee(dto);
	}

	@Override
	public String idChk(String user_id) {
		System.out.println("ServiceImpl>>"+user_id+"idChk");
		return dao.idChk(user_id);
	}

	@Override
	public String duplChkPhone(String user_phone) {
		System.out.println("ServiceImpl>>"+user_phone+"duplChkPhone");
		return dao.duplChkPhone(user_phone);
	}

	@Override
	public String duplChkEmail(String user_email) {
		System.out.println("ServiceImpl>>"+user_email+"duplChkEmail");
		return dao.duplChkEmail(user_email);
	}

	@Override
	public UserLoginDTO login(String user_id) {
		System.out.println("ServiceImpl>>"+user_id+"login");
		return dao.login(user_id);
	}

	@Override
	public UserInfoDTO info(String user_id) {
		System.out.println("ServiceImpl>>"+user_id+"info");
		return dao.info(user_id);
	}
}
