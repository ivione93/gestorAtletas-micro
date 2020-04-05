package com.ivione.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivione.model.Sector;
import com.ivione.repository.ISectorRepo;

@CrossOrigin
@RestController
@RequestMapping("/sector")
public class RestSectorController {
	
	@Autowired
	private ISectorRepo repo;
	
	@GetMapping
	public List<Sector> listar() {
		return repo.findAll();
	}

}
