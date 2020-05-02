package com.ivione.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resultados")
public class Resultados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_resultado")
	private Long idResultados;
	
	@Column(name = "id_competicion")
	private Long idCompeticion;
	
	@Column(name = "id_atleta")
	private Long idAtleta;
	
	@Column(name = "id_prueba")
	private Long idPrueba;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "puntos")
	private String puntos;
	
	public Resultados() {}

	public Resultados(Long idResultados, Long idCompeticion, Long idAtleta, Long idPrueba, String marca,
			String puntos) {
		this.idResultados = idResultados;
		this.idCompeticion = idCompeticion;
		this.idAtleta = idAtleta;
		this.idPrueba = idPrueba;
		this.marca = marca;
		this.puntos = puntos;
	}

	public Long getIdResultados() {
		return idResultados;
	}

	public void setIdResultados(Long idResultados) {
		this.idResultados = idResultados;
	}

	public Long getIdCompeticion() {
		return idCompeticion;
	}

	public void setIdCompeticion(Long idCompeticion) {
		this.idCompeticion = idCompeticion;
	}

	public Long getIdAtleta() {
		return idAtleta;
	}

	public void setIdAtleta(Long idAtleta) {
		this.idAtleta = idAtleta;
	}

	public Long getIdPrueba() {
		return idPrueba;
	}

	public void setIdPrueba(Long idPrueba) {
		this.idPrueba = idPrueba;
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
