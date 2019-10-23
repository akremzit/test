package com.thp.spring.vintud.service;

import java.util.List;

import com.thp.spring.vintud.dto.SearchDTO;

public interface SearchService {
	public void addSearch(SearchDTO searchDTO);

	public List<SearchDTO> findAllSearch();

	public SearchDTO findSearchById(int id);

	public void deleteSearch(int id);
	public void updateSearch(int id,SearchDTO searchDTO);
}
