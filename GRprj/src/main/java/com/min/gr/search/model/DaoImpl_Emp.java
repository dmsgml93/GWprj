package com.min.gr.search.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.gr.emp.dto.EmpDTO;
import com.min.gr.emp.dto.EmpUserDTO;
import com.min.gr.ws.dto.WorkSpaceDTO;

@Repository
public class DaoImpl_Emp implements IDao_Emp {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	private final String NS="com.min.gr.emp.";
	
	@Autowired
	private SqlSessionTemplate service;
	
	/**
	 * 사업장 조회
	 */
	@Override
	public List<WorkSpaceDTO> wsSearch() {
		log.info("DaoImpl 사업장 조회");
		return service.selectList(NS+"wsSearch");
	}

	/**
	 * 입사신청시 자동으로 입력(직원코드, 유저아이디, 사업장 코드, 입사승인여부, 퇴사일)
	 */
	@Override
	public boolean empApplyInsert(Map<String, Object> map) {
		log.info("DaoImpl 입사신청시 자동으로 입력");
		int n = service.insert(NS+"empApplyInsert", map);
		return (n>0)?true:false;
	}

	/**
	 * 입사신청한 회원 조회
	 */
	@Override
	public List<EmpUserDTO> empConfirmSelectD(String ws_code) {
		log.info("DaoImpl 입사신청한 회원 조회");
		return service.selectList(NS+"empConfirmSelectD", ws_code);
	}

	/**
	 * 입사승인 후 회원 정보 업데이트
	 */
	@Override
	public boolean empApplyUpdate(EmpDTO dto) {
		log.info("DaoImpl 입사승인 후 정보 업데이트");
		int n= service.update(NS+"empApplyUpdate", dto);
		return (n>0)?true:false;
	}
	
	/**
	 * 직원 조회
	 */
	@Override
	public List<EmpUserDTO> empAllSelect(String ws_code) {
		log.info("DaoImpl 직원조회");
		return service.selectList(NS+"empAllSelect", ws_code);
	}

	/**
	 * 직원정보 상세보기
	 */
	@Override
	public EmpUserDTO empDetailSelect(Map<String, Object> map) {
		log.info("DaoImpl 직원정보 상세보기");
		return service.selectOne(NS+"empDetailSelect", map);
	}

	/**
	 * 입사거절
	 */
	@Override
	public boolean empApplyReject(String emp_code) {
		log.info("DaoImpl 입사거절");
		int n = service.update(NS+"empApplyReject", emp_code);
		return (n>0)?true:false;
	}

	/**
	 * 직원정보 수정
	 */
	@Override
	public boolean empUpdate(EmpDTO dto) {
		log.info("DaoImpl 직원정보 수정");
		int n = service.update(NS+"empUpdate", dto);
		return (n>0)?true:false;
	}

	/**
	 * 퇴사처리
	 */
	@Override
	public boolean empdelete(Map<String, Object> map) {
		log.info("DaoImpl 퇴사처리");
		int n= service.update(NS+"empdelete", map);
		return (n>0)?true:false;
	}

	/**
	 * 스케줄에서 사용할 사업장 내 직급별 조회
	 */
	@Override
	public List<String> selectWsMember(EmpDTO dto) {
		log.info("DaoImpl 스케줄에서 사용할 사업장 내 직급별 조회");
		return service.selectList(NS+"selectWsMember", dto);
	}
}
