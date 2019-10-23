package com.thp.spring.vintud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.vintud.dto.CategoryDTO;
import com.thp.spring.vintud.service.Impl.CategoryServiceImpl;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {
	@Autowired
	private CategoryServiceImpl cService;

	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CategoryDTO> getAllCategory() {

		return cService.findAll();

	}

	@PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public void addCategory(@RequestBody CategoryDTO categoryDTO) {

		cService.addCategory(categoryDTO);

	}

	@PutMapping(value = "/{categoryId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateCategory(@PathVariable Integer categoryId, @RequestBody CategoryDTO categoryDTO) {

		cService.updateCategory(categoryId, categoryDTO);

	}

	@DeleteMapping(value = "/{categoryId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteCategory(@PathVariable Integer categoryId) {

		cService.deleteCategory(categoryId);

	}

	@GetMapping(value = "/{categoryId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CategoryDTO getAllCategoryById(@PathVariable Integer categoryId) {

		return cService.findCategoryById(categoryId);

	}

	@GetMapping(value = "/category/{categoryNom}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CategoryDTO getAllCategoryByNom(@PathVariable String categoryNom) {

		return cService.findCategoryByNom(categoryNom);

	}

}
