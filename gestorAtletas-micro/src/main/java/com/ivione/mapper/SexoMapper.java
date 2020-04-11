package com.ivione.mapper;

import com.ivione.dto.SexoDto;
import com.ivione.model.Sexo;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class SexoMapper extends ConfigurableMapper {
	
	@Override
	protected void configure(MapperFactory factory) {
		factory.classMap(Sexo.class, SexoDto.class)
			.byDefault()
			.register();
	}
}
