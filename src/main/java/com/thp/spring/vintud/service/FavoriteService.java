package com.thp.spring.vintud.service;

import java.util.List;

import com.thp.spring.vintud.dto.FavoriteDTO;

public interface FavoriteService {

	FavoriteDTO findById(Long id);

	List<FavoriteDTO> findAll();

	void deleteFavorite(Long id);

	void addFavorite(FavoriteDTO f);

	void upadteFavorite(FavoriteDTO f, Long id);

}
