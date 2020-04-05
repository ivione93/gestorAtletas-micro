package com.ivione.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivione.model.Prueba;
import com.ivione.repository.IPruebaRepo;

@CrossOrigin
@RestController
@RequestMapping("/prueba")
public class RestPruebaController {
	
	@Autowired
	private IPruebaRepo repo;
	
	@GetMapping
	public List<Prueba> listar() {
		return repo.findAll();
	}

}
