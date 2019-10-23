package com.thp.spring.vintud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.vintud.entity.UserEntity;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	public UserEntity findByNumTel(Long phone);

	public UserEntity findByPseudo(String pseudo);

}
