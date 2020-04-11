package com.ziming.myBooks.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/request")
public class RequestController {
	
	@RequestMapping("/index")
	public String index(HttpSession session) {
		System.out.println("1111111111111111111111111111111111");
		return "index";
	}
	
}
