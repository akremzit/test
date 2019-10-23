package com.thp.spring.vintud.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.vintud.dto.SearchDTO;
import com.thp.spring.vintud.entity.SearchEntity;
import com.thp.spring.vintud.helper.ModelMapperConverter;
import com.thp.spring.vintud.repository.SearchRepository;
import com.thp.spring.vintud.service.SearchService;

@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	SearchRepository searchRepository;

	public void addSearch(SearchDTO searchDTO) {
		SearchEntity s = ModelMapperConverter.converToEntity(searchDTO, SearchEntity.class);
		searchRepository.save(s);
	}

	@Override
	public List<SearchDTO> findAllSearch() {
		List<SearchDTO> listS = ModelMapperConverter.convertAllToDTO(searchRepository.findAll(), SearchDTO.class);

		return listS;
	}

	@Override
	public SearchDTO findSearchById(int id) {

		return ModelMapperConverter.converToDTO(searchRepository.findById(id).orElse(null), SearchDTO.class);
	}

	@Override
	public void deleteSearch(int id) {
		searchRepository.deleteById(id);
	}

	@Override
	public void updateSearch(int id, SearchDTO searchDTO) {
		SearchDTO sDto = ModelMapperConverter.converToDTO(searchRepository.findById(id).orElse(null), SearchDTO.class);
		if (sDto != null) {
			searchDTO.setId(id);
			searchRepository.save(ModelMapperConverter.converToEntity(searchDTO, SearchEntity.class));
		}
	}
}
