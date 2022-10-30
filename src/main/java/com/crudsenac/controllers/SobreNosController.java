package com.crudsenac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SobreNosController {

	@RequestMapping("/sobreNos")
	public String index() {
		return "sobre/sobreNos";
	}
}
