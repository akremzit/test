package com.thp.spring.vintud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.vintud.entity.AnnounceEntity;

@Transactional(propagation = Propagation.MANDATORY)
@Repository
public interface AnnounceRepository extends JpaRepository<AnnounceEntity, Integer> {
	
	public List<AnnounceEntity> findByTitre(String titre);
	
	@Query(value = "select nb_vue from announcement INNER JOIN myuser ON myuser.id = announcement.vendeur_id where myuser.id = :userId", nativeQuery = true)
	public int findNbVueByVendeurId(@Param("userId") int userId);

	public List<AnnounceEntity> findByLocalisation(String localisation);
}
