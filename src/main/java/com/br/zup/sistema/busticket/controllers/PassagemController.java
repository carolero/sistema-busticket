package com.br.zup.sistema.busticket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.zup.sistema.busticket.services.PassagemService;

@Controller
public class PassagemController {
	@Autowired
	private PassagemService passagemService;
	
	@GetMapping("/")
	public ModelAndView mostrarOnibus() {
		ModelAndView modelAndView = new ModelAndView("index.html");
		modelAndView.addObject("listaOnibus", passagemService.mostrarOnibus());
		return modelAndView;
	}
	
	
	

}
