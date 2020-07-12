package com.min.gr.search.model;

import java.util.List;
import java.util.Map;

import com.min.gr.emp.dto.EmpDTO;
import com.min.gr.emp.dto.EmpUserDTO;
import com.min.gr.ws.dto.WorkSpaceDTO;

public class Service_Emp implements IService_Emp {

	@Override
	public List<WorkSpaceDTO> wsSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean empApplyInsert(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EmpUserDTO> empConfirmSelectD(String ws_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean empApplyUpdate(EmpDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EmpUserDTO> empAllSelect(String ws_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmpUserDTO empDetailSelect(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean empApplyReject(String emp_code) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean empUpdate(EmpDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean empdelete(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return false;
	}

}
