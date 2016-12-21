package br.com.modelo.tethys.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
	@CrossOrigin(origins = "*")
	@RequestMapping(value = { " ", "/" }, method = RequestMethod.GET)
	public String home() {		
		return "index";
	}
}
