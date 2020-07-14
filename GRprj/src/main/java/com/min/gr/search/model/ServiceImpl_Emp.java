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
		return null;
	}

	@Override
	public boolean empApplyInsert(Map<String, Object> map) {
		
		return false;
	}

	@Override
	public List<EmpUserDTO> empConfirmSelectD(String ws_code) {
		
		return null;
	}

	@Override
	public boolean empApplyUpdate(EmpDTO dto) {
		
		return false;
	}

	@Override
	public List<EmpUserDTO> empAllSelect(String ws_code) {
		
		return null;
	}

	@Override
	public EmpUserDTO empDetailSelect(Map<String, Object> map) {
		
		return null;
	}

	@Override
	public boolean empApplyReject(String emp_code) {
		
		return false;
	}

	@Override
	public boolean empUpdate(EmpDTO dto) {
		
		return false;
	}

	@Override
	public boolean empdelete(Map<String, Object> map) {
		
		return false;
	}

	@Override
	public List<String> selectWsMember(EmpDTO dto) {
		
		return null;
	}

}
