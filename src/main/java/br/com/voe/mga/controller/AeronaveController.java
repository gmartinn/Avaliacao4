package br.com.voe.mga.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.voe.mga.modelo.Aeronave;

@Controller
public class AeronaveController {
	@RequestMapping("/aeronaves")
	@ResponseBody
	public List<Aeronave> listar(){
		Aeronave aero1 = new Aeronave("Embraer", "Bandeirantes", "EMB-100");
		Aeronave aero2 = new Aeronave("Embraer", "Legacy", "450");
		Aeronave aero3 = new Aeronave("Embraer", "Legacy", "650");
		
		return Arrays.asList(aero1, aero2, aero3);
	}
	
}
