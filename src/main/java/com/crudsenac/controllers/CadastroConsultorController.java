package com.crudsenac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crudsenac.models.CadastroConsultor;
import com.crudsenac.repository.CadastroConsRepository;

@Controller
public class CadastroConsultorController {
	
	@Autowired
	private CadastroConsRepository ccr;
	
	@RequestMapping(value="/cadastrarConsultor", method=RequestMethod.GET)
	public String form() {
		return "cadastroConsultor/cadConsultor";
	}
	
	@RequestMapping(value="/cadastrarConsultor", method=RequestMethod.POST)
	public String form(CadastroConsultor cadastroConsultor) {
		
		ccr.save(cadastroConsultor);
		
		return "redirect:/cadastrarConsultor";
	}

}
