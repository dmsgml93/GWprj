package com.min.gr.search.model;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.gr.emp.dto.EmpDTO;
import com.min.gr.emp.dto.EmpUserDTO;
import com.min.gr.ws.dto.WorkSpaceDTO;

@Service
public class ServiceImpl_Emp implements IService_Emp {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IDao_Emp dao;
	
	/**
	 * 사업장검색
	 */
	@Override
	public List<WorkSpaceDTO> wsSearch() {
		log.info("ServiceImpl 사업장검색");
		return dao.wsSearch();
	}

	/**
	 * 입사신청시 자동으로 입력(직원코드, 유저아이디, 사업장 코드, 입사승인여부, 퇴사일)
	 */
	@Override
	public boolean empApplyInsert(Map<String, Object> map) {
		log.info("ServiceImpl 입사신청시 자동으로 입력");
		return dao.empApplyInsert(map);
	}

	/**
	 * 입사신청한 회원 조회
	 */
	@Override
	public List<EmpUserDTO> empConfirmSelectD(String ws_code) {
		log.info("ServiceImpl 입사신청한 회원 조회");
		return dao.empConfirmSelectD(ws_code);
	}

	/**
	 * 입사승인 후 회원 정보 업데이트
	 */
	@Override
	public boolean empApplyUpdate(EmpDTO dto) {
		log.info("ServiceImpl 입사승인 후 회원정보 업데이트");
		return dao.empApplyUpdate(dto);
	}

	/**
	 * 사업장별 직원조회
	 */
	@Override
	public List<EmpUserDTO> empAllSelect(String ws_code) {
		log.info("ServiceImpl 사업장별 직원조회");
		return null;
	}

	/**
	 * 직원 상세보기
	 */
	@Override
	public EmpUserDTO empDetailSelect(Map<String, Object> map) {
		log.info("ServiceImpl 직원 상세보기");
		return null;
	}

	/**
	 * 입사 거절
	 */
	@Override
	public boolean empApplyReject(String emp_code) {
		log.info("ServiceImpl 입사 거절");
		return dao.empApplyReject(emp_code);
	}

	/**
	 * 직원정보 수정
	 */
	@Override
	public boolean empUpdate(EmpDTO dto) {
		log.info("ServiceImpl 직원정보 수정");
		return dao.empUpdate(dto);
	}

	/**
	 * 퇴사처리
	 */
	@Override
	public boolean empdelete(Map<String, Object> map) {
		log.info("ServiceImpl 퇴사처리");
		return dao.empdelete(map);
	}

	/**
	 * 스케줄에서 사용할 사업장 내 직급별 조회
	 */
	@Override
	public List<String> selectWsMember(EmpDTO dto) {
		log.info("ServiceImpl 스케줄에서 사용할 사업장 내 직급별 조회");
		return dao.selectWsMember(dto);
	}

}
