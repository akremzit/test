package com.thp.spring.vintud.service;

import java.util.List;

import com.thp.spring.vintud.dto.RoleDTO;
import com.thp.spring.vintud.entity.RoleEntity;

public interface RoleService {

	RoleEntity createRole(RoleDTO roleDTO);

	void deleteRole(int idRole);

	List<RoleDTO> findAllRole();

	RoleDTO findRoleById(int id);

	RoleEntity updateRole(int id, RoleDTO roleDTO);
}
