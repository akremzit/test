package com.thp.spring.vintud.service;

import java.util.List;

import com.thp.spring.vintud.dto.UserDTO;
import com.thp.spring.vintud.entity.UserEntity;

public interface UserService {

	UserDTO findById(int userId);

	UserDTO findByPseudo(String pseudo);

	List<UserDTO> findAll();

	void deleteUser(int userId);

	UserEntity addUser(UserDTO userDTO);

	UserDTO findByNumTel(Long phone);

	Boolean connexionUser(String username, String password);

}
