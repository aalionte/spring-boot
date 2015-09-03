package com.endava.movie.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.endava.movie.domain.Actor;

@Repository
@EnableTransactionManagement
public class ActorDAO extends AbstractDAO<Actor> {

	protected ActorDAO() {
		super(Actor.class);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Actor> getAllActors() {
		return em().createQuery("SELECT ac FROM Actor ac order by ac.id desc").getResultList();
	}

}