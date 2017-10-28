package com.springmvc.security4.dao;

import java.util.List;

import com.springmvc.security4.model.UserProfile;

public interface UserProfileDao {
	
	List<UserProfile> findAll();
    
    UserProfile findByType(String type);
     
    UserProfile findById(int id);

}
