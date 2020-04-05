package com.ivione.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "resultados")
public class Resultados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_resultados")
	private Long idResultados;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_competicion")
	private Competicion competicion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_atleta")
	private Atletas atleta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_prueba")
	private Prueba prueba;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "puntos")
	private String puntos;
	
	public Resultados() {}

	public Resultados(Long idResultados, Competicion competicion, Atletas atleta, Prueba prueba, String marca,
			String puntos) {
		this.idResultados = idResultados;
		this.competicion = competicion;
		this.atleta = atleta;
		this.prueba = prueba;
		this.marca = marca;
		this.puntos = puntos;
	}

	public Long getIdResultados() {
		return idResultados;
	}

	public void setIdResultados(Long idResultados) {
		this.idResultados = idResultados;
	}

	public Competicion getCompeticion() {
		return competicion;
	}

	public void setCompeticion(Competicion competicion) {
		this.competicion = competicion;
	}

	public Atletas getAtleta() {
		return atleta;
	}

	public void setAtleta(Atletas atleta) {
		this.atleta = atleta;
	}

	public Prueba getPrueba() {
		return prueba;
	}

	public void setPrueba(Prueba prueba) {
		this.prueba = prueba;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPuntos() {
		return puntos;
	}

	public void setPuntos(String puntos) {
		this.puntos = puntos;
	}
}
