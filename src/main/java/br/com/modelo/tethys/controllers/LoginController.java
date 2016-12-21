package br.com.modelo.tethys.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	@CrossOrigin(origins = "*")
	@RequestMapping(value = { " ", "/" }, method = RequestMethod.GET)
	public String login() {
		return "login.html";
	}
}
