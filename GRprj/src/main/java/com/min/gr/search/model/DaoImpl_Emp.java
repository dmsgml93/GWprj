package com.min.gr.search.model;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.min.gr.emp.dto.EmpDTO;
import com.min.gr.emp.dto.EmpUserDTO;
import com.min.gr.ws.dto.WorkSpaceDTO;

@Repository
public class DaoImpl_Emp implements IDao_Emp {

	@Override
	public List<WorkSpaceDTO> wsSearch() {
		
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
