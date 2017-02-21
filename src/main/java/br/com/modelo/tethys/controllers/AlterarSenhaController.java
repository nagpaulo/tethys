package br.com.modelo.tethys.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/alterarsenha")
public class AlterarSenhaController {
	@CrossOrigin(origins = "*")
	@RequestMapping(value = { " ", "/" }, method = RequestMethod.GET)
	public String alterarSenha() {		
		return "alterarsenha";
	}
}
