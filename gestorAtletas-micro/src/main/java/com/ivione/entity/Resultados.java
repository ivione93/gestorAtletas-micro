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
		return puntos;
	}

	public void setPuntos(String puntos) {
		puntos = calculaPuntos(idPrueba, marca).toString();
		this.puntos = puntos;
	}
	
	public String convertirMarca(String marca) {
		int pos = marca.indexOf(':');
		int fin = marca.length();
		
		String marcaMin = marca.substring(0, pos);
		String marcaSeg = marca.substring(pos+1, fin);
		Double min = Double.parseDouble(marcaMin) * 60;
		Double seg = Double.parseDouble(marcaSeg);
		Double marcaConvertida = min + seg;
		
		return String.valueOf(marcaConvertida);
	}
	
	public String calculaPuntos(Long idPrueba, String marca) {
		Double puntosHungaros = 0.0;
		String max = "1400";
		String maxMarca[] = {"9.46", "18.90", "41.97", //Velocidad
							 "97.91", "199.44", // Medio fondo
							 "425.53", "450.46", // Fondo
							 "968", // Marcha (5km W)
							 "12.28", "44.86", // Vallas (110mv y 400mv)
							 "2.54", "6.48", "9.19", "19.19", // Saltos
							 "24.66", "78.39", "93.30", "100.90", // Lanzamientos
							 "37.06", "173.17" }; // Relevos
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
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(maxMarca[2])) / Double.parseDouble(convertirMarca(marca));
				break;
			case 23:
			case 24:
			case 33:
			case 34:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(maxMarca[3])) / Double.parseDouble(convertirMarca(marca));
				break;
			case 27:
			case 28:
			case 37:
			case 38:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(maxMarca[4])) / Double.parseDouble(convertirMarca(marca));
				break;
			case 41:
			case 42:
			case 47:
			case 48:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(maxMarca[5])) / Double.parseDouble(convertirMarca(marca));
				break;
			case 55:
			case 56:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(maxMarca[6])) / Double.parseDouble(convertirMarca(marca));
				break;
			case 57:
			case 58:
			case 59:
			case 60:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(maxMarca[7])) / Double.parseDouble(convertirMarca(marca));
				break;
			case 67:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(maxMarca[8])) / Double.parseDouble(marca);
				break;
			case 69:
			case 70:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(maxMarca[9])) / Double.parseDouble(marca);
				break;
			case 71:
			case 72:
			case 79:
			case 80:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(marca)) / Double.parseDouble(maxMarca[10]);
				break;
			case 73:
			case 74:
			case 81:
			case 82:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(marca)) / Double.parseDouble(maxMarca[11]);
				break;
			case 75:
			case 76:
			case 83:
			case 84:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(marca)) / Double.parseDouble(maxMarca[12]);
				break;
			case 77:
			case 78:
			case 85:
			case 86:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(marca)) / Double.parseDouble(maxMarca[13]);
				break;
			case 87:
			case 88:
			case 89:
			case 90:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(marca)) / Double.parseDouble(maxMarca[14]);
				break;
			case 91:
			case 92:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(marca)) / Double.parseDouble(maxMarca[15]);
				break;
			case 93:
			case 94:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(marca)) / Double.parseDouble(maxMarca[16]);
				break;
			case 95:
			case 96:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(marca)) / Double.parseDouble(maxMarca[17]);
				break;
			case 105:
			case 106:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(maxMarca[18])) / Double.parseDouble(convertirMarca(marca));
				break;
			case 103:
			case 104:
			case 107:
			case 108:
				puntosHungaros = (Double.parseDouble(max) * Double.parseDouble(maxMarca[19])) / Double.parseDouble(convertirMarca(marca));
				break;
			default:
				break;
		}
		return String.valueOf(Math.round(puntosHungaros));
	}
}
