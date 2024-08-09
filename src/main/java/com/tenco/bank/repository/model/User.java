package com.tenco.bank.repository.model;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User {
	private Integer id;
	private String username;
	private String password;
	private String fullname;
	private Timestamp createdAt;

}
