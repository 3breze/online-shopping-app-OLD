package com.oul.onlineshoppingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Sping");
		return mv;
	}

//	@RequestMapping(value = "/test")
//	// u url mora da se koristi greeting inace dobijamo 400
//	// public ModelAndView test(@RequestParam("greeting")String greeting){
//	public ModelAndView test(@RequestParam(value = "greeting", required = false) String greeting) {
//		if(greeting == null)
//			greeting = "Hello there no greeting";
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
	@RequestMapping(value = "/test/{greeting}")//ako ukucam /test/CaoBella 
	public ModelAndView test(@PathVariable("greeting") String greeting) {
		if(greeting == null)
			greeting = "There no greeting";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}

}