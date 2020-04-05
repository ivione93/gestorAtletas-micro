package com.ivione.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivione.model.Competicion;

public interface ICompeticionRepo extends JpaRepository<Competicion, Long>{
	
}
