package com.thp.spring.vintud.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.vintud.dto.CategoryDTO;
import com.thp.spring.vintud.entity.CategoryEntity;
import com.thp.spring.vintud.helper.ModelMapperConverter;
import com.thp.spring.vintud.repository.CategoryRepository;
import com.thp.spring.vintud.service.CategoryService;

@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ModelMapperConverter mConverter;

	@Override
	public void addCategory(CategoryDTO categoryDto) {

		categoryRepository.save(mConverter.converToEntity(categoryDto, CategoryEntity.class));
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		categoryRepository.deleteById(categoryId);
	}

	@Override
	public List<CategoryDTO> findAll() {
		List<CategoryEntity> catList = categoryRepository.findAll();
		return ModelMapperConverter.convertAllToDTO(catList, CategoryDTO.class);

	}

	@Override
	public CategoryDTO findCategoryById(Integer id) {
		return mConverter.converToDTO(categoryRepository.findById(id).orElse(null), CategoryDTO.class);
	}

	@Override
	public CategoryDTO findCategoryByNom(String nom) {
		return mConverter.converToDTO(categoryRepository.findCategoryByNom(nom), CategoryDTO.class);
	}

	@Override
	public void updateCategory(Integer id, CategoryDTO categoryDto) {
		CategoryEntity cat = categoryRepository.findById(id).orElse(null);
		if (cat != null) {
			categoryDto.setId(id);

		categoryRepository.save(mConverter.converToEntity(categoryDto, CategoryEntity.class));
		}}

}
