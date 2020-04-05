package com.ivione.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ivione.model.Atletas;
import com.ivione.repository.IAtletasRepo;

@CrossOrigin
@Controller
public class DemoController {
	
	@Autowired
	private IAtletasRepo aRepo;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		Atletas a = new Atletas(null, name, name, null, name, name, name, name, null, null, null);
		a.setNombre("Iván");
		a.setApellidos("García Gómez");
		//a.setSexo("Masculino");
		a.setCiudad("Madrid");
		a.setFechaNacimiento(null);
		a.setLicencia("M1599");
		a.setTelefono("609748500");
		aRepo.save(a);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		model.addAttribute("atletas", aRepo.findAll());
		return "greeting";
	}
	
}
