///**
// * 
// */
//package com.thp.spring.vintud.controller;
//
//import static org.junit.Assert.fail;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
///**
// * @author abouabid
// *
// */
//@RunWith(SpringRunner.class)
//@WebMvcTest(FavoriteController.class)
//
//public class FavoriteControllerTest {
//
//	@Autowired
//	private MockMvc mvc;
//
//	/**
//	 * Test method for
//	 * {@link com.thp.spring.vintud.controller.FavoriteController#getAllFavorites()}.
//	 */
//	@Test
//	public void testGetAllFavorites() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/favorite").accept(MediaType.APPLICATION_JSON)).andDo(print())
//				.andExpect(status().isOk()).andExpect(MockMvcResultMatchers.jsonPath("$.favorite").exists())
//				.andExpect(MockMvcResultMatchers.jsonPath("$.favorite[*].favoriteId").isNotEmpty());
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.thp.spring.vintud.controller.FavoriteController#addFavorite(com.thp.spring.vintud.dto.FavoriteDTO)}.
//	 */
//	@Test
//	public void testAddFavorite() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.thp.spring.vintud.controller.FavoriteController#getFavoriteById(java.lang.Long)}.
//	 */
//	@Test
//	public void testGetFavoriteById() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/favorite/{id}", 1).accept(MediaType.APPLICATION_JSON)).andDo(print())
//				.andExpect(status().isOk()).andExpect(MockMvcResultMatchers.jsonPath("$.favoriteId").value(1));
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.thp.spring.vintud.controller.FavoriteController#deleteFavorite(java.lang.Long)}.
//	 */
//	@Test
//	public void testDeleteFavorite() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.delete("/favorite/{id}", 4)).andExpect(status().isAccepted());
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.thp.spring.vintud.controller.FavoriteController#updateFavorite(com.thp.spring.vintud.dto.FavoriteDTO, java.lang.Long)}.
//	 */
//	@Test
//	public void testUpdateFavorite() {
//		fail("Not yet implemented");
//	}
//
//}
