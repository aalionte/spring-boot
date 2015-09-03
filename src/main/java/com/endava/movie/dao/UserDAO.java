package com.endava.movie.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.endava.movie.domain.User;

@Repository
@EnableTransactionManagement
public class UserDAO extends AbstractDAO<User> {

	protected UserDAO() {
		super(User.class);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		return em().createQuery("SELECT u FROM User u order by u.userEmail asc").getResultList();
	}

	@Transactional
	public User getUserByEmail(String email) {
		return (User) em().createQuery("SELECT q FROM User q WHERE q.userEmail like :email")
				.setParameter("email", email).getSingleResult();

	}

	public User getUserById(long id) {
		return (User) em().createQuery("SELECT q FROM User q WHERE q.id = :id ").setParameter("id", id)
				.getSingleResult();
	}
}
