package com.crudsenac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicacoesAbertasController {

	@RequestMapping("/verPublicacoesAbertas")
	public String index() {
		return "index";
	}
}
