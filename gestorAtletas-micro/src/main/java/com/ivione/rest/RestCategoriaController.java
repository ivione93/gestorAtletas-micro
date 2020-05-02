package com.ivione.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivione.entity.Categoria;
import com.ivione.repository.ICategoriasRepo;

@CrossOrigin
@RestController
@RequestMapping("/categoria")
public class RestCategoriaController {
	
	@Autowired
	private ICategoriasRepo repo;
	
	@GetMapping
	public List<Categoria> listar() {
		return repo.findAll();
	}

}
