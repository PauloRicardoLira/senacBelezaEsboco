package com.crudsenac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class setoresController {

	@RequestMapping("/setores")
	public String index() {
		return "setores/setores";
	}
}
