package com.springmvc.security4.service;

import java.util.List;

import com.springmvc.security4.model.UserProfile;

public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);

	List<UserProfile> findAll();

}
