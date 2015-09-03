package com.endava.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.endava.movie.domain.User;
import com.endava.movie.service.UserService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/users")
@PreAuthorize("hasAuthority('ADMIN')")
@Api(basePath = "/users", value = "Users", description = "Operations with Users", produces = "application/json")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ModelAndView getUsers() {
		ModelAndView mv = new ModelAndView("users");
		mv.addObject("users", userService.getAllUsers());
		return mv;
	}

	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get user by id", notes = "Returns the user with the given id.")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "") })
	public User getUserById(@PathVariable long id) {
		return userService.getUserById(id);
	}

}