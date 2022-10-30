package com.crudsenac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crudsenac.models.PostagemProfessor;
import com.crudsenac.repository.PostagemProfRepository;

@Controller
public class PostagemProfessorController {
	
	@Autowired
	private PostagemProfRepository ppr;
	
	@RequestMapping(value="/cadastrarPostagemProf", method=RequestMethod.GET)
	public String form() {
		return "postagem/formPostagemProf";
	}
	
	@RequestMapping(value="/cadastrarPostagemProf", method=RequestMethod.POST)
	public String form(PostagemProfessor postagemProfessor) {
		
		ppr.save(postagemProfessor);
		
		return "redirect:/cadastrarPostagemProf";
	}
	
	@RequestMapping(value="/publicacoesRestritas")
	public ModelAndView listaPostagensRest() {
		ModelAndView mv = new ModelAndView("visualizarPostagens/publiRestrito");
		Iterable<PostagemProfessor> publicacoesRestritas = ppr.findAll();
		mv.addObject("postagensRestritas", publicacoesRestritas);
		return mv;
		
	}
}
