package com.crudsenac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crudsenac.models.CadastroAluno;
import com.crudsenac.repository.CadastroAlunRepository;

@Controller
public class CadastroAlunoController {
	
	@Autowired
	private CadastroAlunRepository car;
	
	@RequestMapping(value="/cadastrarAluno", method=RequestMethod.GET)
	public String form() {
		return "cadastroAluno/cadAluno";
	}
	
	@RequestMapping(value="/cadastrarAluno", method=RequestMethod.POST)
	public String form(CadastroAluno cadastroAluno) {
		
		car.save(cadastroAluno);
		
		return "redirect:/cadastrarAluno";
	}
}
