package com.tenco.bank.repository.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tenco.bank.repository.model.User;

@Mapper
public interface UserRepository {
	public int insert(User user);
	public int updateById(User user);
	public int deleteById(Integer id);
	public User findById(Integer id);
	public List<User> findAll();
}
