package com.thp.spring.vintud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.vintud.entity.CategoryEntity;

@Transactional(propagation = Propagation.MANDATORY)
@Repository

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
	public CategoryEntity findCategoryByNom(String nom);

}
