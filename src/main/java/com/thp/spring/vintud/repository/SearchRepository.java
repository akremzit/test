package com.thp.spring.vintud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.vintud.entity.SearchEntity;

@Transactional(propagation = Propagation.MANDATORY)
@Repository
public interface SearchRepository extends JpaRepository<SearchEntity, Integer>  {

}
