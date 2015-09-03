package com.endava.movie.domain;

import org.springframework.security.core.authority.AuthorityUtils;

public class UserDetails extends org.springframework.security.core.userdetails.User {

	private static final long serialVersionUID = 5170505279277840569L;
	private User user;

	public UserDetails(User user) {
		super(user.getUserEmail(), user.getUserPassword(),
				AuthorityUtils.createAuthorityList(user.getUserRole().toString()));
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public Long getId() {
		return user.getId();
	}

	public Role getRole() {
		return user.getUserRole();
	}

	@Override
	public String toString() {
		return "CurrentUser{" + "user=" + user + "} " + super.toString();
	}
}
