package com.thp.spring.vintud.service.Impl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.vintud.dto.RoleDTO;
import com.thp.spring.vintud.entity.RoleEntity;
import com.thp.spring.vintud.service.RoleService;

@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RoleServiceImpTest {
	@Autowired
	RoleService roleService;

	@Test
	public void testCreateRole() {
		RoleDTO roleDTO = new RoleDTO();
		roleDTO.setNom("TEST");
		System.out.println(roleDTO.getId());
		RoleEntity role = roleService.createRole(roleDTO);
		System.out.println(role);
		assertEquals("TEST", role.getNom());
	}

	@Test
	public void testDeleteRole() {
		List<RoleDTO> rolesBefore = roleService.findAllRole();
		roleService.deleteRole(3);
		List<RoleDTO> rolesAfter = roleService.findAllRole();

		assertEquals(rolesAfter.size()-1,rolesBefore.size());
	
	}

	@Test
	public void testFindAllRole() {
		List<RoleDTO> roles = roleService.findAllRole();
		assertEquals(4, roles.size());
	}

	@Test
	public void testFindRoleById() {
		RoleDTO role = roleService.findRoleById(1);
		assertEquals("admin", role.getNom());
	}

	@Test
	public void testUpdateRole() {
		RoleDTO role = new RoleDTO();
		role.setNom("clientTEST");

		RoleEntity role2 = roleService.updateRole(2, role);
		assertEquals(role.getNom(), role2.getNom());
	}
}