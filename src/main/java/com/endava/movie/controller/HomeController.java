package com.endava.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.endava.movie.domain.Movie;
import com.endava.movie.service.MovieService;

@Controller
public class HomeController {

	@Autowired
	MovieService movieService;

	@RequestMapping(value = "/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		List<Movie> movies = movieService.getAllMovies();
		mv.addObject("movies", movies);
		return mv;
	}

}
