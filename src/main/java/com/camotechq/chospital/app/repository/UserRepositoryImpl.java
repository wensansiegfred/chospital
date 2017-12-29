package com.camotechq.chospital.app.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.camotechq.chospital.app.model.User;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public void save(User user) {
		em.persist(user);
		em.flush();
	}
	
	public User getUserById(Long id) {
		return em.find(User.class, id);
	}

	public User getByUsername(String username) {
		return (User) em.createQuery("SELECT u FROM User u WHERE u.username = :username")
						.setParameter("username", username)
						.getSingleResult();
	}
}
