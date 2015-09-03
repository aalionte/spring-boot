package com.endava.movie.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.endava.movie.domain.Movie;

@Repository
@EnableTransactionManagement
public class MovieDAO extends AbstractDAO<Movie> {

	protected MovieDAO() {
		super(Movie.class);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Movie> getAllMovies() {
		return em().createQuery("SELECT m FROM Movie m order by m.id desc").getResultList();
	}

	@Transactional
	public Movie getMovieById(long id) {
		return (Movie) em().createQuery("SELECT m FROM Movie m WHERE m.id like :id").setParameter("id", id)
				.getSingleResult();
	}

}
