package br.com.modelo.tethys.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.modelo.tethys.auth.model.User;
import br.com.modelo.tethys.auth.services.SecurityService;
import br.com.modelo.tethys.auth.services.UserService;
import br.com.modelo.tethys.auth.validator.UserValidator;

@Controller
public class LoginController {
	@Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/api/home";
    }
    
    @RequestMapping(value = "/esqueceusenha", method = RequestMethod.GET)
    public String esqueceusenha(Model model){  	
    	model.addAttribute("userForm", new User());
    	return "esqueceusenha";
    }
    
    @RequestMapping(value = "/esqueceusenha", method = RequestMethod.POST)
    public String esqueceusenha(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
        	 return "login";
        }
         
        return "redirect:/api/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null){
            model.addAttribute("message", "Usuário ou senha inválidos.");
        	model.addAttribute("type", "alert-danger");
        	model.addAttribute("icons", "fa-exclamation-circle");
        }
        
        if (logout != null){
            model.addAttribute("message", "Você saiu do sistema.");
        	model.addAttribute("type", "alert-warning");
        	model.addAttribute("icons", "fa-info-circle");
        }	

        return "login";
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        return "home";
    }
}
