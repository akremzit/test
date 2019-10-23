package com.thp.spring.vintud.service;

import java.util.List;

import com.thp.spring.vintud.dto.CategoryDTO;

public interface CategoryService {
	public void addCategory(CategoryDTO categoryDto);

	public void deleteCategory(Integer categoryId);

	public List<CategoryDTO> findAll();
	public void updateCategory(Integer id,CategoryDTO categoryDto);

	public CategoryDTO findCategoryById(Integer id);

	public CategoryDTO findCategoryByNom(String nom);
}
