package com.ivione.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivione.entity.Sexo;
import com.ivione.repository.ISexoRepo;

@CrossOrigin
@RestController
@RequestMapping("/sexo")
public class RestSexoController {
	
	@Autowired
	private ISexoRepo repo;
	
	@GetMapping
	public List<Sexo> listar() {
		return repo.findAll();
	}

}
