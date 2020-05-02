package com.ivione.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "especialidad")
public class Especialidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_especialidad")
	private Long idEspecialidad;
	
	@Column(name = "n_especialidad")
	private String nEspecialidad;
	
	public Especialidad() {}
	
	public Especialidad(Long idEspecialidad, String nEspecialidad) {
		this.idEspecialidad = idEspecialidad;
		this.nEspecialidad = nEspecialidad;
	}
	
	public Long getIdEspecialidad() {
		return idEspecialidad;
	}
	
	public void setIdEspecialidad(Long idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	
	public String getnEspecialidad() {
		return nEspecialidad;
	}
	
	public void setnEspecialidad(String nEspecialidad) {
		this.nEspecialidad = nEspecialidad;
	}
}
