package com.endava.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endava.movie.dao.ActorDAO;
import com.endava.movie.domain.Actor;
import com.endava.movie.service.ActorService;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	ActorDAO actorDAO;
	
	@Override
	public List<Actor> getAllActors() {
		return actorDAO.getAllActors();
	}

}
