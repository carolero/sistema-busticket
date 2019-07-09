package com.br.zup.sistema.busticket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.zup.sistema.busticket.Models.ClienteModel;
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
	
	@GetMapping("/cadastrar/{onibusId}")
	public ModelAndView cadastrarCliente() {
		ModelAndView modelAndView = new ModelAndView("cadastrar-clientes.html");
		return modelAndView;
	}
	
	@PostMapping("/cadastrar/{onibusId}")
	public String finalizarCompra(@PathVariable int onibusId, ClienteModel clienteModel) {
		if(clienteModel.getIdade() >= 18) {
			passagemService.cadastrarCliente(onibusId, clienteModel);
			return "redirect:/";
		} else {
			return "barrado.html";
		}
	}
	
	

}
