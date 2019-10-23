package com.thp.spring.vintud.helper;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.thp.spring.vintud.dto.CategoryDTO;
import com.thp.spring.vintud.dto.MyDTO;
import com.thp.spring.vintud.entity.CategoryEntity;
import com.thp.spring.vintud.entity.MyEntity;

@Component
public class ModelMapperConverter {

	static ModelMapper modelMapper = new ModelMapper();

	public static <T extends MyDTO> T converToDTO(MyEntity source, Class<T> clazz) {
		return modelMapper.map(source, clazz);
	}

	public static <T extends MyEntity> T converToEntity(MyDTO source, Class<T> clazz) {
		return modelMapper.map(source, clazz);
	}

	public static <T extends MyEntity> List<T> convertAllToEntity(List<? extends MyDTO> source, Class<T> clazz) {
		List<T> entities = new ArrayList<>();
		for (MyDTO dto : source) {
			entities.add(ModelMapperConverter.converToEntity(dto, clazz));

		}
		return entities;
	}
	public static <T extends MyDTO> List<T> convertAllToDTO(List<? extends MyEntity> source, Class<T> clazz) {
		List<T> entitieDTOs = new ArrayList<>();
		for (MyEntity entity : source) {
			entitieDTOs.add(ModelMapperConverter.converToDTO(entity, clazz));

		}
		return entitieDTOs;
	}
	private ModelMapperConverter() {
		super();
	}


}
