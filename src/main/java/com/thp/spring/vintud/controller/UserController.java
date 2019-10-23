package com.thp.spring.vintud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.vintud.dto.UserDTO;
import com.thp.spring.vintud.service.UserService;

@RestController(value = "/user")
@CrossOrigin
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping(value = "/user/{userId}")
	public UserDTO findById(@PathVariable int userId) {
		return userService.findById(userId);

	}

	@GetMapping(value = "/userPseudo/{userPseudo}")
	public UserDTO findByPseudo(@PathVariable String userPseudo) {
		return userService.findByPseudo(userPseudo);

	}

	@GetMapping(value = "/userPhone/{userPhone}")
	public UserDTO findByNumTel(@PathVariable Long userPhone) {
		return userService.findByNumTel(userPhone);

	}

	@PostMapping(value = "/user")
	public void addUser(@RequestBody UserDTO userDTO) {
		userService.addUser(userDTO);

	}

	@GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<UserDTO> findAll() {
		return userService.findAll();
	}

	@DeleteMapping(value = "/user/{userId}")
	public void deleteUser(@PathVariable int userId) {
		userService.deleteUser(userId);
	}

//	@GetMapping(value = "/login")
//	public Boolean login(@RequestParam String username,@RequestParam String password) {
//		
//		return userService.connexionUser(username, password);
//	}
}
