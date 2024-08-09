package com.tenco.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tenco.bank.dto.SignUpDTO;
import com.tenco.bank.handler.exception.DataDeliveryException;
import com.tenco.bank.handler.exception.RedirectException;
import com.tenco.bank.repository.interfaces.UserRepository;

@Service
public class UserService {
	
	
	private UserRepository userRespository;
	
	@Autowired
	public UserService(UserRepository userRespository) {
		this.userRespository=userRespository;
	}
	
	@Transactional
	public void createUser(SignUpDTO dto) {
		int result=0;
		try {
			System.out.println("유저 서비스-dto 확인: "+dto);
			result=userRespository.insert(dto.toUser());
			System.out.println("result 확인 : "+result);
		} catch(Exception e) {
			throw new RedirectException("알 수 없는 오류",HttpStatus.SERVICE_UNAVAILABLE);
		} 
		
		if(result!=1) {
			throw new DataDeliveryException("회원가입 실패", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
