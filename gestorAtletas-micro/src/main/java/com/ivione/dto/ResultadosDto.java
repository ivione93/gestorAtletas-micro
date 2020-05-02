package com.ivione.dto;

public class ResultadosDto {
	
	private Long idResultado;
	private String atleta;
	private String competicion;
	private String prueba;
	private String marca;
	private String puntos;
	
	public ResultadosDto() {}
	
	public ResultadosDto(Long idResultado, String atleta, String competicion, String prueba, String marca,
			String puntos) {
		this.idResultado = idResultado;
		this.atleta = atleta;
		this.competicion = competicion;
		this.prueba = prueba;
		this.marca = marca;
		this.puntos = puntos;
	}

	public Long getIdResultado() {
		return idResultado;
	}

	public void setIdResultado(Long idResultado) {
		this.idResultado = idResultado;
	}

	public String getAtleta() {
		return atleta;
	}

	public void setAtleta(String atleta) {
		this.atleta = atleta;
	}

	public String getCompeticion() {
		return competicion;
	}

	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}

	public String getPrueba() {
		return prueba;
	}

	public void setPrueba(String prueba) {
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
