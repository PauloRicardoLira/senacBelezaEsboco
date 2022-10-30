package com.crudsenac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crudsenac.models.CadastroProfessor;
import com.crudsenac.repository.CadastroProfRepository;

@Controller
public class CadastroProfessorController {

	@Autowired
	private CadastroProfRepository cpr;
	
	@RequestMapping(value="/cadastrarProfessor", method=RequestMethod.GET)
	public String form() {
		return "cadastroProfessor/cadProfessor";
	}
	
	@RequestMapping(value="/cadastrarProfessor", method=RequestMethod.POST)
	public String form(CadastroProfessor cadastroProfessor) {
		
		cpr.save(cadastroProfessor);
		
		return "redirect:/cadastrarProfessor";
	}
}
