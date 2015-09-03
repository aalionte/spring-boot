package com.endava.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.endava.movie.domain.Actor;
import com.endava.movie.service.ActorService;

@Controller
public class ActorController {

	@Autowired
	ActorService actorService;

	@RequestMapping(value = "/actor")
	public ModelAndView getAllActors() {
		ModelAndView mv = new ModelAndView("actor");
		List<Actor> actors = actorService.getAllActors();
		mv.addObject("actors", actors);
		return mv;
	}

}
