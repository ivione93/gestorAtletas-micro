package com.ivione.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prueba")
public class Prueba {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prueba")
	private Long idPrueba;
	
	@OneToOne
	@JoinColumn(name = "id_sexo")
	private Sexo sexo;
	
	@OneToOne
	@JoinColumn(name="id_ambito")
	private Ambito ambito;
	
	@OneToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	@OneToOne
	@JoinColumn(name = "id_sector")
	private Sector sector;
	
	@OneToOne
	@JoinColumn(name = "id_especialidad")
	private Especialidad especialidad;
	
	@OneToMany(mappedBy = "prueba")
	private List<Resultados> competiciones = new ArrayList<>();
	
	public Prueba() {}
	
	public Prueba(Long idPrueba, Sexo sexo, Ambito ambito, Categoria categoria, Sector sector,
			Especialidad especialidad, List<Resultados> competiciones) {
		this.idPrueba = idPrueba;
		this.sexo = sexo;
		this.ambito = ambito;
		this.categoria = categoria;
		this.sector = sector;
		this.especialidad = especialidad;
		this.competiciones = competiciones;
	}

	public Long getIdPrueba() {
		return idPrueba;
	}
	
	public void setIdPrueba(Long idPrueba) {
		this.idPrueba = idPrueba;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public Ambito getAmbito() {
		return ambito;
	}
	
	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Sector getSector() {
		return sector;
	}
	
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	public List<Resultados> getCompeticiones() {
		return competiciones;
	}
	
	public void setCompeticiones(List<Resultados> competiciones) {
		this.competiciones = competiciones;
	}
}
