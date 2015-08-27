package com.endava.movie.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aalionte on 8/27/2015.
 */
public class HomeController {

    @RequestMapping(value="/")
    public String home(){
        return "home";
    }
}
