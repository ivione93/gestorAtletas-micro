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

	public Resultados(Long idResultados, Long idCompeticion, Long idAtleta, Long idPrueba, String marca, String puntos) {
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
		String puntos = calculaPuntos(idPrueba, marca).toString();
		return puntos;
	}

	public void setPuntos(String puntos) {
		puntos = calculaPuntos(idPrueba, marca).toString();
		this.puntos = puntos;
	}
	
	public String calculaPuntos(Long idPrueba, String marca) {
		Double puntosHungaros = 0.0;
		String max = "1400";
		String maxMarca[] = {"9.46", "18.90", "41.97", "2:05.82"};
		
		switch (idPrueba.intValue()) {
		case 3:
		case 4:
		case 11:
		case 12:
			puntosHungaros = ((Double.parseDouble(max) * Double.parseDouble(maxMarca[0])) / Double.parseDouble(marca));
			break;
		case 5:
		case 6:
		case 13:
		case 14:
			puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(maxMarca[1])) / Double.parseDouble(marca);
			break;
		case 9:
		case 10:
		case 17:
		case 18:
			puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(maxMarca[2])) / Double.parseDouble(marca);
			break;
		case 23:
		case 24:
		case 33:
		case 34:
			puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(maxMarca[2])) / Double.parseDouble(marca);
			break;
		default:
			break;
		}
		return String.valueOf(Math.round(puntosHungaros));
	}
}
