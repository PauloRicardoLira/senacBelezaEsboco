package com.crudsenac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicacoesRestritasController {

	@RequestMapping("/verPublicacoes")
	public String publiRestrito() {
		return "visualizarPostagens/publiRestrito";
	}
}
