package com.crudsenac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crudsenac.models.PostagemConsultor;
import com.crudsenac.repository.PostagemConsRepository;

@Controller
public class PostagemConsultorController {
	
	@Autowired
	private PostagemConsRepository pcr;
	
	@RequestMapping(value="/cadastrarPostagemCons", method=RequestMethod.GET)
	public String form() {
		return "postagemConsultor/postagemCons";
	}
	
	@RequestMapping(value="/cadastrarPostagemCons", method=RequestMethod.POST)
	public String form(PostagemConsultor postagemConsultor) {
		
		pcr.save(postagemConsultor);
		
		return "redirect:/cadastrarPostagemCons";
	}

}
