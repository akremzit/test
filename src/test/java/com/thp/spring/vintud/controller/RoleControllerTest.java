package com.thp.spring.vintud.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thp.spring.vintud.dto.RoleDTO;
import com.thp.spring.vintud.service.RoleService;

@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class RoleControllerTest {

	@MockBean
	private RoleService mockRoleService;
	@Autowired
	RoleService roleService;

	@Autowired
	private MockMvc mockMvc;

//	@Before
//	public void setup() {
//		RoleDTO roleDTO = new RoleDTO(50, "testRole");
//		RoleEntity role = new RoleEntity(50, "testRole");
//		Mockito.when(mockRoleService.createRole(roleDTO)).thenReturn(role);
//	}

	public static String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	void testCreateRole() {
		try {
			this.mockMvc.perform(post("/role")
//				 .content("nom", "testROLEPOST")

					.content(asJsonString(new RoleDTO(10, "testROLEPOST"))).contentType(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON))

					.andExpect(status().isOk());

		} catch (Exception e) {
			e.printStackTrace();
		}
//		RoleDTO roleDTO = new RoleDTO(50, "testRole");
//		RoleEntity role2 = mockRoleService.createRole(roleDTO);
//		System.out.println(roleDTO);
//		System.out.println(role2.getId() + role2.getNom());
//
//		assertEquals(roleDTO.getNom(), role2.getNom());
	}

	@Test
	void testGetAllRole() {
		try {
			this.mockMvc.perform(get("/role")).andExpect(status().isOk());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Test
//	void testGetRoleById() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testUpdateRole() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDeleteRole() {
//		fail("Not yet implemented");
//	}

}
