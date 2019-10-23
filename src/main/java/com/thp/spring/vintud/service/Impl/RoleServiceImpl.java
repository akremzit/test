package com.thp.spring.vintud.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.vintud.dto.RoleDTO;
import com.thp.spring.vintud.entity.RoleEntity;
import com.thp.spring.vintud.helper.ModelMapperConverter;
import com.thp.spring.vintud.repository.RoleRepository;
import com.thp.spring.vintud.service.RoleService;

@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public RoleEntity createRole(RoleDTO roleDTO) {
		RoleEntity role = ModelMapperConverter.converToEntity(roleDTO, RoleEntity.class);
		return roleRepository.save(role);
	}

	@Override
	public void deleteRole(int idRole) {
		roleRepository.deleteById(idRole);
	}

	@Override
	public List<RoleDTO> findAllRole() {
		return ModelMapperConverter.convertAllToDTO(roleRepository.findAll(), RoleDTO.class);

	}

	@Override
	public RoleDTO findRoleById(int id) {

		return ModelMapperConverter.converToDTO(roleRepository.findById(id).orElse(null), RoleDTO.class);
	}

	@Override
	public RoleEntity updateRole(int id, RoleDTO roleDTO) {

		RoleEntity roleById = roleRepository.findById(id).orElse(null);
		RoleEntity role = ModelMapperConverter.converToEntity(roleDTO, RoleEntity.class);
		if (roleById != null) {
			role.setId(id);

		}
		return roleRepository.save(role);
	}

}
