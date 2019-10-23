/**
 * 
 */
package com.thp.spring.vintud.service.Impl;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.thp.spring.vintud.dto.FavoriteDTO;

/**
 * @author abouabid
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FavoriateServiceImplTest {

	/**
	 * Test method for
	 * {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#findById(java.lang.Long)}.
	 * 
	 */
	@Autowired
	FavoriteServiceImpl favoriteService;

//	@Test
//	public void testFindById() {
//
//		FavoriteDTO result = favoriteService.findById(1L);
//		// FavoriteDTO f = new FavoriteDTO(1, 1, 1,null) ;
//		// assertEquals(f, result);
//		assertNotNull(result);
//	}

	/**
	 * Test method for
	 * {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#findAll()}.
	 */
//	@Test
//	public void testFindAll() {
//		List<FavoriteDTO> result = favoriteService.findAll();
//		assertNotNull(result);
//	}

	/**
	 * Test method for
	 * {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#deleteFavorite(java.lang.Long)}.
	 */
//	@Test
//	public void testDeleteFavorite() {
//		favoriteService.deleteFavorite(1L);
//
//		assertNull(favoriteService.findById( 1L));
//	}

	/**
	 * Test method for
	 * {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#addFavorite(com.thp.spring.vintud.dto.FavoriteDTO)}.
	 */
//	@Test
//	public void testAddFavorite() {
//		Date refDate = new Date(0);
//		List<FavoriteDTO> fav = favoriteService.findAll();
//		FavoriteDTO f = new FavoriteDTO(refDate);
//		favoriteService.addFavorite(f);
//		List<FavoriteDTO> fav1 = favoriteService.findAll();
//		assertEquals((fav.size() + 1), fav1.size());
//	}

	/**
	 * Test method for
	 * {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#upadteFavorite(com.thp.spring.vintud.dto.FavoriteDTO, java.lang.Long)}.
	 */
	@Test
	public void testUpadteFavorite() {
		Date refDate = new Date(0);
		FavoriteDTO favDTO = new FavoriteDTO(refDate);
		favoriteService.upadteFavorite(favDTO, 3L);
		FavoriteDTO f = favoriteService.findById(3L);
		assertEquals(f.getRefDate(), refDate);
	}

}
