package com.min.gr.ctrl;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.min.gr.user.dto.UserInfoDTO;
import com.min.gr.user.dto.UserLoginDTO;
import com.min.gr.user.model.ServiceImpl_User;

@Controller
public class UserCtrl {

	@Autowired
	ServiceImpl_User service;

	@RequestMapping(value = "/loginForm.do", method = RequestMethod.GET)
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model, Authentication user) {

		if (user != null) {
			UserDetails userD = (UserDetails) user.getPrincipal();
		}
		if (error != null) {
			model.addAttribute("msg", "로그인 에러");
		}
		if (logout != null) {
			model.addAttribute("msg", "로그아웃 성공");
		}
		System.out.println("@@@@@");
		return "login";
	}

	// 회원가입 성공 매핑
//	 <!-- 고용주  -->
	@RequestMapping(value = "/Employer.do", method = RequestMethod.POST)
	public String joinInfoEmployer(UserInfoDTO dto, Model model) {
		System.out.println("회원가입 정보" + dto.toString());
		service.joinInfoEmployer(dto);
		return "login";
	}

//	 <!-- 일반직원-->

	@RequestMapping(value = "/joinInfoEmployee.do", method = RequestMethod.GET)
	public String joinInfoEmployee() {
		System.out.println("회원가입페이지");
		return "user/joinInfoEmployee";
	}

	@RequestMapping(value = "/idCheck.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> idCheck(String user_id) {
		System.out.println(user_id);
		Map<String, String> map = new HashMap<String, String>();
		System.out.println("Welcome idCheck.do :\t {}" + user_id);
		boolean isc = service.idDuplicateCheck(user_id);
		System.out.println(user_id);
		map.put("isc", isc + "");
		return map;
	}


	@RequestMapping(value = "/Employee.do", method = RequestMethod.POST)
	public String afterjoinInfoEmployee(UserInfoDTO dto, Model model) {
		System.out.println("회원가입 정보" + dto.toString());
		service.joinInfoEmployee(dto);
		return "login";
	}

	// 로그인 후 각자 페이지 가는 매핑
	@RequestMapping(value = "/result.do", method = RequestMethod.POST)
	public String Employ(Model model, Authentication user, Principal principal, Principal principal2,
			HttpSession session) {

		System.out.println("result");

		String id = principal.getName();

		UserLoginDTO ulDto = service.login(id);
		UserInfoDTO uiDto = service.info(id);

		System.out.println(ulDto);
		ulDto.getUser_auth();
		System.out.println(ulDto.getUser_auth());
		ulDto.getUser_id();

		model.addAttribute("ulDto", ulDto);
		session.setAttribute("mem", ulDto);

		if (uiDto.getUser_type().trim().equalsIgnoreCase("employer")) {
			uiDto.getUser_type();
			System.out.println(uiDto.getUser_type() + "employer");
			return "employer";
		} else if (uiDto.getUser_type().trim().equalsIgnoreCase("employee")) {
			uiDto.getUser_type();
			System.out.println(uiDto.getUser_type() + "employee");
			return "employee";
		} else if (uiDto.getUser_type().trim().equalsIgnoreCase("ROLE_A")) {
			uiDto.getUser_type();
			System.out.println(uiDto.getUser_type() + "ROLE_A");
			return "redirect:/loginaddmin.do";

		}
		return "";
	}

}
