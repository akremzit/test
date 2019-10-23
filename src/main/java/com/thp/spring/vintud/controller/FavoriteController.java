package com.thp.spring.vintud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.vintud.dto.FavoriteDTO;
import com.thp.spring.vintud.service.Impl.FavoriteServiceImpl;

@RestController(value="/favorite")
@CrossOrigin
public class FavoriteController {
	
	@Autowired
	FavoriteServiceImpl favoriteService;
	
	@GetMapping(value = "/favorite", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FavoriteDTO> getAllFavorites() {
		return favoriteService.findAll();
	}

	@PostMapping(value = "/favorite", produces = MediaType.APPLICATION_JSON_VALUE)
	public void addFavorite(@RequestBody FavoriteDTO favoriteDTO) {
		favoriteService.addFavorite(favoriteDTO);

	}

	@GetMapping(value = "/favorite/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public FavoriteDTO getFavoriteById(@PathVariable Long id) {
		
		return favoriteService.findById(id);
	}
	
	@DeleteMapping(value = "/favorite/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteFavorite(@PathVariable Long id) {
		
		favoriteService.deleteFavorite(id);
	}
	
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateFavorite(@RequestBody FavoriteDTO favoriteDTO, @PathVariable Long id) {
		System.out.println(favoriteDTO.getRefAnnonce().isEtatDis()+"error");
		favoriteService.upadteFavorite(favoriteDTO, id);
	}
	
}
