package br.com.modelo.tethys.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.modelo.tethys.auth.model.User;
import br.com.modelo.tethys.auth.model.Usuario;

@Controller
@RequestMapping(value = "/alterarsenha")
public class AlterarSenhaController {
	
	@Autowired(required = true)
	private HttpServletRequest requestServlet;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = { " ", "/" }, method = RequestMethod.GET)
	public String alterarSenha(Model model) {
		HttpSession session = requestServlet.getSession();
		Usuario usuario = (Usuario) session.getAttribute("SECURITY_USER");
		
		model.addAttribute("alterarSenhaForm", new Usuario());
		model.addAttribute("usuarioLogado", usuario);
		return "alterarsenha";
	}
	
	@RequestMapping(value = {"/"," "}, method = RequestMethod.POST)
    public String update(@ModelAttribute("alterarSenhaForm") User alterarSenhaForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
        	 return "alterarsenha";
        }
         
        return "redirect:/api/alterarsenha";
    }

}
