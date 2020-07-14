package com.min.gr.user.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.gr.user.dto.UserInfoDTO;
import com.min.gr.user.dto.UserLoginDTO;
@Repository
public class DaoImpl_User implements IDao_User {

	
	@Autowired
	private SqlSessionTemplate session;
	private final String NS = "com.min.gr.user.";
	
	private Logger log = LoggerFactory.getLogger(this.getClass());

	
	@Override
	public boolean joinInfoEmployer(UserInfoDTO dto) {
		log.info("DaoImpl_User joinInfoEmployer : {}",dto);
		return (session.insert(NS+"joinInfoEmployer", dto)>0)?true:false;
	}

	@Override
	public boolean joinInfoEmployee(UserInfoDTO dto) {
		log.info("DaoImpl_User joinInfoEmployee : {}",dto);
		return (session.insert(NS+"joinInfoEmployee", dto)>0)?true:false;
	}

	@Override
	public String idChk(String user_id) {
		log.info("DaoImpl_User idChk : {}");
		return session.selectOne(NS+"idChk", user_id);
	}

	@Override
	public String duplChkPhone(String user_phone) {
		log.info("DaoImpl_User duplChkPhone : {}");
		return session.selectOne(NS+"duplChkEmail", user_phone);
	}

	@Override
	public String duplChkEmail(String user_email) {
		log.info("DaoImpl_User duplChkEmail : {}");
		return session.selectOne(NS+"duplChkPhone", user_email);
	}

	@Override
	public UserLoginDTO login(String user_id) {
		log.info("DaoImpl_User login : {}");
		return session.selectOne(NS+"login", user_id);
	}

	@Override
	public UserInfoDTO info(String user_id) {
		log.info("DaoImpl_User info : {}");
		return session.selectOne(NS+"info", user_id);
	}

}
