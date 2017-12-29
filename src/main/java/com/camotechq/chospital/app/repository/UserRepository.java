package com.camotechq.chospital.app.repository;

import com.camotechq.chospital.app.model.User;

public interface UserRepository {
	void save(User user);
	User getUserById(Long id);
	User getByUsername(String username);
}
