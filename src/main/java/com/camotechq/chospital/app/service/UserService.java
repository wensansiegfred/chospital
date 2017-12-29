package com.camotechq.chospital.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camotechq.chospital.app.model.User;
import com.camotechq.chospital.app.repository.UserRepository;

@Service("userService")
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public User getUserById(Long id) {
		return userRepository.getUserById(id);
	}
	
	public User getUserByUsername(String username) {
		return userRepository.getByUsername(username);
	}
}
