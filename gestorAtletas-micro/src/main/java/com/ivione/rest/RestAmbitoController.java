package com.ivione.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivione.entity.Ambito;
import com.ivione.repository.IAmbitoRepo;

@CrossOrigin
@RestController
@RequestMapping("/ambito")
public class RestAmbitoController {
	
	@Autowired
	private IAmbitoRepo repo;
	
	@GetMapping
	public List<Ambito> listar() {
		return repo.findAll();
	}

}
