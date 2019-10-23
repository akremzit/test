package com.thp.spring.vintud.service.Impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.thp.spring.vintud.dto.FavoriteDTO;
import com.thp.spring.vintud.entity.FavoriteEntity;
import com.thp.spring.vintud.helper.ModelMapperConverter;
import com.thp.spring.vintud.repository.FavoriteRepository;
import com.thp.spring.vintud.service.FavoriteService;

@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service
public class FavoriteServiceImpl implements FavoriteService {

	@Autowired
	FavoriteRepository favoriteRepo;
	
	@Override
	public FavoriteDTO findById(Long id) { 
		
		return ModelMapperConverter.converToDTO(favoriteRepo.findById(id).orElse(null), FavoriteDTO.class);
	}

	@Override
	public List<FavoriteDTO> findAll() {
		List<FavoriteEntity> favorites = favoriteRepo.findAll();
		return  ModelMapperConverter.convertAllToDTO(favorites, FavoriteDTO.class);
	}

	@Override
	public void deleteFavorite(Long id) { 
		favoriteRepo.deleteById(id); 

	}

	@Override
	public void addFavorite(FavoriteDTO f) {
		FavoriteEntity fav= ModelMapperConverter.converToEntity(f, FavoriteEntity.class);
		favoriteRepo.save(fav);
      
	}
	public void upadteFavorite(FavoriteDTO f, Long id) {
		FavoriteEntity favoriteById = favoriteRepo.findById(id).orElse(null);
		FavoriteEntity fav= ModelMapperConverter.converToEntity(f, FavoriteEntity.class);
	
		if (favoriteById!= null) {
			fav.setId(id);
			favoriteRepo.save(fav);
		}
		
      
	}

	
}
