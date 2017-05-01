package br.com.modelo.tethys.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.modelo.tethys.entity.vo.AutoresVO;

@RestController
public class TestController {
	
	@RequestMapping(value = "/autores", method = RequestMethod.GET, produces = "application/json")
    public List<AutoresVO> registration() {
		List<AutoresVO> autores = new ArrayList<>();
		
		AutoresVO autor = new AutoresVO();		
		autor.setId(1);
		autor.setNome("Paulo");
		autor.setEmail("nagpaulo@gmail.com");
		autores.add(autor);
		
		AutoresVO autor1 = new AutoresVO();
		autor1.setId(2);
		autor1.setNome("Tiago Hernandes");
		autor1.setEmail("tiago.hernandes@gmail.com");
		autores.add(autor1);
		
        return autores;
    }
	
}

