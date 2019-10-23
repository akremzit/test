///**
// * 
// */
//package com.thp.spring.vintud.service.Impl.test;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertSame;
//import static org.junit.Assert.fail;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.sql.Date;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.thp.spring.vintud.dto.FavoriteDTO;
//import com.thp.spring.vintud.entity.FavoriteEntity;
//import com.thp.spring.vintud.helper.ModelMapperConverter;
//import com.thp.spring.vintud.repository.FavoriteRepository;
//import com.thp.spring.vintud.service.Impl.FavoriteServiceImpl;
//
///**
// * @author abouabid
// *
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class FavoriteServiceImpTest {
//	@Autowired
//	FavoriteServiceImpl favoriteService;
//	
//	@MockBean
//	FavoriteRepository favoriteRepo;
//
//	/**
//	 * Test method for
//	 * {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#findById(java.lang.Long)}.
//	 */
//	@Test
//	public void testFindById() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#findAll()}.
//	 */
//	@Test
//	public void testFindAll() {
//		Date refDate = new Date(0);
//		when(favoriteRepo.findAll()).thenReturn(Stream.of(new FavoriteEntity(refDate ),
//				new FavoriteEntity(refDate)).collect(Collectors.toList()));
//		assertEquals(2, favoriteService.findAll().size());
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#deleteFavorite(java.lang.Long)}.
//	 */
//	@Test
//	public void testDeleteFavorite() {
//		favoriteService.deleteFavorite(1L);
//		verify(favoriteRepo, times(1)).deleteById(1L);
//		
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#addFavorite(com.thp.spring.vintud.dto.FavoriteDTO)}.
//	 */
//	@Test
//	public void testAddFavorite() {
//		Date refDate = new Date(0);
//		FavoriteEntity f = new FavoriteEntity( refDate);
//		when(favoriteRepo.save(f)).thenReturn(f);
//		FavoriteDTO fav= ModelMapperConverter.converToDTO(f, FavoriteDTO.class);
//		assertEquals(f, favoriteService.addFavorite(fav));
//		
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.thp.spring.vintud.service.Impl.FavoriteServiceImpl#upadteFavorite(com.thp.spring.vintud.dto.FavoriteDTO, java.lang.Long)}.
//	 */
//	@Test
//	public void testUpadteFavorite() {
//		fail("Not yet implemented");
//	}
//
//}
