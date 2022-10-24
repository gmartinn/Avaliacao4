package br.com.voe.mga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AloController {

	@RequestMapping("/")
	@ResponseBody
	public String alo() {
		return "Turma Java Senai Tagua é a melhor";
	}
}
