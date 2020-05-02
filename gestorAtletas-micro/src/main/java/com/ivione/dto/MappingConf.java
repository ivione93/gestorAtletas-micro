package com.ivione.dto;

import com.ivione.entity.Resultados;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class MappingConf extends ConfigurableMapper {

	@Override
	protected void configure(MapperFactory factory) {
		factory.classMap(Resultados.class, ResultadosDto.class)
		.field("idCompeticion", "competicion")
		.field("idAtleta", "atleta")
		.field("idPrueba", "prueba")
		.byDefault()
		.register();
	}
}
