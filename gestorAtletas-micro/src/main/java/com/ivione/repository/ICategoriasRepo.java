package com.ivione.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivione.entity.Categoria;

public interface ICategoriasRepo extends JpaRepository<Categoria, Integer>{

}
