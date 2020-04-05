package com.ivione.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivione.model.Especialidad;
import com.ivione.repository.IEspecialidadRepo;

@CrossOrigin
@RestController
@RequestMapping("/especialidad")
public class RestEspecialidadController {
	
	@Autowired
	private IEspecialidadRepo repo;
	
	@GetMapping
	public List<Especialidad> listar() {
		return repo.findAll();
	}

}
