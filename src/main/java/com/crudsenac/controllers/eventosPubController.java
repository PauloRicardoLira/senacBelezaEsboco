package com.crudsenac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class eventosPubController {

	@RequestMapping("/eventos")
	public String index() {
		return "eventos/eventosPub";
	}
}
