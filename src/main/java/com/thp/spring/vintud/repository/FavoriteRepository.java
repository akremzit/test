package com.thp.spring.vintud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.vintud.entity.FavoriteEntity;


@Transactional(propagation = Propagation.MANDATORY)
@Repository

public interface FavoriteRepository extends JpaRepository<FavoriteEntity, Long> {


}
