/**
 * 
 */
package com.thp.spring.vintud.service.Impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.vintud.dto.UserDTO;
import com.thp.spring.vintud.entity.UserEntity;
import com.thp.spring.vintud.service.Impl.UserServiceImpl;

/**
 * @author azitouni
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserServiceImplTest {
	@Autowired
	UserServiceImpl userServiceImpl;

	@Test
	public void testFindById() {
		UserDTO User = userServiceImpl.findById(1);
		assertEquals(1, User.getId());
	}

	@Test
	public void testFindByNumTel() {
		
		UserDTO user = userServiceImpl.findByNumTel(Long.valueOf("21348"));
		assertEquals("21348", user.getNumTel().toString());
	

	}

	/**
	 * Test method for
	 * {@link com.thp.spring.vintud.service.Impl.UserServiceImpl#findByPseudo(java.lang.String)}.
	 */
	@Test
	public void testFindByPseudo() {
		UserDTO User = userServiceImpl.findByPseudo("moez");
		assertEquals("moez", User.getPseudo());
	}

	/**
	 * Test method for
	 * {@link com.thp.spring.vintud.service.Impl.UserServiceImpl#findAll()}.
	 */
	@Test
	public void testFindAll() {
		List<UserDTO> UserList = userServiceImpl.findAll();
		assertEquals(3, UserList.size());
	}

	/**
	 * Test method for
	 * {@link com.thp.spring.vintud.service.Impl.UserServiceImpl#deleteUser(int)}.
	 */
//	@Test
//	public void testDeleteUser() {
//		UserDTO User = userServiceImpl.deleteUser(1);
//	assertNull(userServiceImpl.findById(1));
//	

//	}

	/**
	 * Test method for
	 * {@link com.thp.spring.vintud.service.Impl.UserServiceImpl#addUser(com.thp.spring.vintud.dto.UserDTO)}.
	 */
//	@Test
//	public void testAddUser() {
//		UserDTO userDTO = new UserDTO();
//		userDTO.setAdresse("gafsa");
//		userDTO.setMotDePasse("akremzit");
//		userDTO.setId(3);
//		userDTO.setMail("akrem@gmail.com");
//		System.out.println(userDTO.getId());
//		UserEntity user = userServiceImpl.addUser(userDTO);
//		System.out.println(user);
//		assertEquals(3, user.getId());
//	}	

	}

