package com.thp.spring.vintud.service.Impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.thp.spring.vintud.dto.CategoryDTO;
import com.thp.spring.vintud.service.CategoryService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

	@Autowired
	CategoryService categoryService;

	@Test
	public void testAddCategory() {
		CategoryDTO categoryDTO = new CategoryDTO("nom", "description");
		categoryService.addCategory(categoryDTO);

		assertThat( categoryService.findCategoryById(3)).isNotNull();

	}

	@Test
	public void testDeleteCategory() {

		categoryService.deleteCategory(2);
		assertThat(categoryService.findCategoryById(2)).isNull();
	}

	@Test
	public void testFindAll() {
		assertNotNull(categoryService.findAll());
	}

	@Test
	public void testFindCategoryById() {
		assertNotNull(categoryService.findCategoryById(1));
	}

	@Test
	public void testFindCategoryByNom() {
		assertNotNull(categoryService.findCategoryByNom("Vêtements"));
	}

	@Test
	public void testUpdateCategory() {
		CategoryDTO categoryDTO = new CategoryDTO(1,"Vêtements", "Tous les vêtements des femmes");
		categoryService.updateCategory(1, categoryDTO);
		CategoryDTO c=categoryService.findCategoryById(1);
		assertEquals(c.getNom(), "Vêtements");
		

	}

}
