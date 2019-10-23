/**
 * 
 */
package com.thp.spring.vintud.service.Impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.thp.spring.vintud.dto.FavoriteDTO;
import com.thp.spring.vintud.entity.AnnounceEntity;

import com.thp.spring.vintud.entity.UserEntity;
import com.thp.spring.vintud.service.Impl.FavoriteServiceImpl;

/**
 * @author abouabid
 *
 */
public class FavoriateTest {

	/**
	 * Test method for {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#findById(java.lang.Long)}.
	 * 
	 */
	@Autowired
	FavoriteServiceImpl favoriteService;
	
	@Test
	public void testFindById() {
		
		FavoriteDTO result = favoriteService.findById((long) 1);
		 assertNotNull(result);
	}

	/**
	 * Test method for {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#findAll()}.
	 */
	@Test
	public void testFindAll() {
		List<FavoriteDTO> result = favoriteService.findAll();
		assertNotNull(result);
	}

	/**
	 * Test method for {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#deleteFavorite(java.lang.Long)}.
	 */
	@Test
	public void testDeleteFavorite() {
//		FavoriteDTO result = favoriteService.deleteFavorite((long) 1);
//		 assertNotNull(result);
	}

	/**
	 * Test method for {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#addFavorite(com.thp.spring.vintud.dto.FavoriteDTO)}.
	 */
	@Test
	public void testAddFavorite() {
		Date refDate = new Date(0);
		AnnounceEntity refAnnonce = new AnnounceEntity();
		UserEntity refUtilisateur = new UserEntity();
		FavoriteDTO f = new FavoriteDTO (refAnnonce, refUtilisateur, refDate);
		favoriteService.addFavorite(f);
		
		 assertThat(favoriteService.findById((long) 1)).isNotNull();
	}

	/**
	 * Test method for {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#upadteFavorite(com.thp.spring.vintud.dto.FavoriteDTO, java.lang.Long)}.
	 */
	@Test
	public void testUpadteFavorite() {
		fail("Not yet implemented");
	}

}
