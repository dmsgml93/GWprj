package com.min.gr.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserCtrl {

	@RequestMapping(value = "/loginPage.do",method = RequestMethod.GET)
	public String login() {
		System.out.println("@@@@@");
		return "loginPage";
	}
}
