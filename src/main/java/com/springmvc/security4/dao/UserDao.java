package com.springmvc.security4.dao;

import java.util.List;

import com.springmvc.security4.model.User;

public interface UserDao {

	User findById(int id);

	User findBySSO(String sso);

	void save(User user);

	void deleteBySSO(String sso);

	List<User> findAllUsers();
}
