package com.tenco.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tenco.bank.dto.SignUpDTO;
import com.tenco.bank.handler.exception.DataDeliveryException;
import com.tenco.bank.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@GetMapping("/sign-up")
	public String signUpPage() {
		return "user/signUp";
	}
	
	@PostMapping("/sign-up")
	public String signUpProc(SignUpDTO dto) {
		System.out.println("포스트매핑 확인");
		if(dto.getUsername()==null || dto.getUsername().isEmpty()) {
			System.out.println("에러 1");
			throw new DataDeliveryException("username을 입력하세요.", HttpStatus.BAD_REQUEST);
		}
		if(dto.getPassword()==null || dto.getPassword().isEmpty()) {
			System.out.println("에러 2");
			throw new DataDeliveryException("password을 입력하세요.", HttpStatus.BAD_REQUEST);
		}
		if(dto.getFullname()==null || dto.getFullname().isEmpty()) {
			System.out.println("에러 3");
			throw new DataDeliveryException("fullname을 입력하세요.", HttpStatus.BAD_REQUEST);
		}
		
		System.out.println("create user : "+dto);
		userService.createUser(dto);
		
		return "redirect:/main-page";
		
	}

}
