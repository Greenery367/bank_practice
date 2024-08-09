package com.tenco.bank.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tenco.bank.handler.exception.DataDeliveryException;
import com.tenco.bank.handler.exception.RedirectException;
import com.tenco.bank.handler.exception.UnAuthorizedException;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	private HttpSession session;
	
	public MainController(HttpSession session) {
		this.session=session;
	}
	
	@GetMapping("/main-page")
	public String mainPage() {
		return "/main";
	}
	
	@GetMapping("/error-test1")
	public String errorData1() {
		if(true) {
			throw new RedirectException("잘못된 요청입니다.", HttpStatus.NOT_FOUND);
		}
		return "/main";
	}
	
	@GetMapping("/error-test2")
	public String errorData2() {
		if(true) {
			throw new DataDeliveryException("잘못된 데이터입니다.", HttpStatus.BAD_REQUEST);
		}
		return "/main";
	}
	
	
	@GetMapping("/error-test3")
	public String errorData3() {
		if(true) {
			throw new UnAuthorizedException("인증되지 않은 사용자입니다.", HttpStatus.UNAUTHORIZED);
		}
		return "/main";
	}
}
