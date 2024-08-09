package com.tenco.bank.repository.model;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {
	private Integer id;
	private String number;
	private String password;
	private Long balance;
	private Integer userId;
	private Timestamp createdAt;
	
	public void withdrawl(Long amount) {
		this.balance-=amount;
	}
	
	public void deposit(Long amount) {
		this.balance+=amount;
	}
	
}
