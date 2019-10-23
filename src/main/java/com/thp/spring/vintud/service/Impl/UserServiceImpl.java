package com.thp.spring.vintud.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.vintud.dto.UserDTO;
import com.thp.spring.vintud.entity.UserEntity;
import com.thp.spring.vintud.helper.ModelMapperConverter;
import com.thp.spring.vintud.repository.UserRepository;
import com.thp.spring.vintud.service.UserService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDTO findById(int userId) {
		UserEntity user = userRepository.findById(userId).orElse(null);
		return ModelMapperConverter.converToDTO(user, UserDTO.class);

	}

	@Override
	public UserDTO findByNumTel(Long phone) {
		UserEntity user = userRepository.findByNumTel(phone);
		return ModelMapperConverter.converToDTO(user, UserDTO.class);
	}

	@Override
	public UserDTO findByPseudo(String pseudo) {
		UserEntity user = userRepository.findByPseudo(pseudo);
		return ModelMapperConverter.converToDTO(user, UserDTO.class);
	}

	@Override
	public List<UserDTO> findAll() {
		List<UserEntity> user = userRepository.findAll();
		return ModelMapperConverter.convertAllToDTO(user, UserDTO.class);
	}

	@Override
	public void deleteUser(int userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public UserEntity addUser(UserDTO userDTO) {
		UserEntity user = ModelMapperConverter.converToEntity(userDTO, UserEntity.class);
		return userRepository.save(user);

	}

	@Override
	public Boolean connexionUser(String username, String password) {
		UserEntity userByUsername = userRepository.findByPseudo(username);
		return userByUsername.getMotDePasse().equals(password);
	}

}
