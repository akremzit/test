package com.thp.spring.vintud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.vintud.dto.SearchDTO;
import com.thp.spring.vintud.service.SearchService;

@RestController(value = "/search")
@CrossOrigin
public class SearchController {
	@Autowired
	SearchService searchService;

	@PostMapping(value = "/search")
	public void create(@RequestBody SearchDTO searchDTO) {
System.out.println(searchDTO.getTypeHabit());
		searchService.addSearch(searchDTO);
	}
	@GetMapping(value="/search")
	public List<SearchDTO> getAllSearch(){
		return searchService.findAllSearch();
	}
	
	@DeleteMapping(value="/search/{id}")
	public void deleteSearch(@PathVariable int id) {
		searchService.deleteSearch(id);
	}
	
	@GetMapping(value="/search/{id}")
	public SearchDTO getSearchById(@PathVariable int id ) {
		return searchService.findSearchById(id);
	}
	
	@PutMapping(value="/search/{id}")
	public void updateSearch(@RequestBody SearchDTO searchDTO ,@PathVariable int id) {
		searchService.updateSearch(id,searchDTO);
	}

}
