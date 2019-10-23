package com.thp.spring.vintud.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.vintud.dto.RoleDTO;
import com.thp.spring.vintud.service.RoleService;

@RestController(value = "/role")
@CrossOrigin
public class RoleController {
	@Autowired
	RoleService roleService;

	@PostMapping(value = "/role")
	public void createRole(@RequestBody RoleDTO roleDTO) {
		roleService.createRole(roleDTO);
	}
	@GetMapping(value = "/role")
	public List<RoleDTO> getAllRole() {
		return roleService.findAllRole();
	}

	@GetMapping(value = "/role/{idRole}", produces = MediaType.APPLICATION_JSON_VALUE)
	public RoleDTO getRoleById(@PathVariable int idRole) {
		return roleService.findRoleById(idRole);
	}

	@PutMapping(value = "/role/{idRole}")
	public void updateRole(@RequestBody RoleDTO roleDTO, @PathVariable int idRole) {
		roleService.updateRole(idRole, roleDTO);
	}

	@DeleteMapping(value = "/role/{idRole}")
	public void deleteRole(@PathVariable int idRole) {
		roleService.deleteRole(idRole);
	}
}