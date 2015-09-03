package com.endava.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endava.movie.dao.MovieDAO;
import com.endava.movie.domain.Movie;
import com.endava.movie.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDAO movieDAO;

	@Override
	public List<Movie> getAllMovies() {
		return movieDAO.getAllMovies();
	}

}
