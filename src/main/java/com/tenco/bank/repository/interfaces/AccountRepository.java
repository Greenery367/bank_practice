package com.tenco.bank.repository.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.tenco.bank.repository.model.Account;

@Mapper
public interface AccountRepository {
	public int insert(Account account);
	public int updateById(Account account);
	public int deleteById(Integer id,String name);
	
	public List<Account> findByUserid(@Param("userId") Integer principalId);
	public Account findByNumber(@Param("number")String id);
}
