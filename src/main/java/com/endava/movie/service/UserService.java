package com.endava.movie.service;

import java.util.Collection;

import com.endava.movie.domain.User;

public interface UserService {

	User getUserById(long id);

	User getUserByEmail(String email);

	Collection<User> getAllUsers();
}
