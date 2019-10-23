package com.thp.spring.vintud.controller;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.thp.spring.vintud.dto.SearchDTO;
import com.thp.spring.vintud.service.Impl.SearchServiceImpl;
import com.thp.spring.vintud.util.ArticleType;
import com.thp.spring.vintud.util.Size;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SearchControllerTest {

	@MockBean
	private SearchServiceImpl serviceMock;

	@Before
	public void setup() {
		Mockito.when(serviceMock.findAllSearch())
				.thenReturn(Stream
						.of(new SearchDTO(4, Size.M, ArticleType.ROBE, "couleur", 20.0, 50.0, null),
								new SearchDTO(4, Size.M, ArticleType.ROBE, "couleur", 20.0, 50.0, null))
						.collect(Collectors.toList()));
		;
	}

	@Autowired
	private MockMvc mvc;

//	@Test
//	public void testCreate() throws Exception {
//		
//	}

	@Test
	public void testGetAllSearch() throws Exception {
		MvcResult result = mvc.perform(MockMvcRequestBuilders.get("/search").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn();
		String resultContent = result.getResponse().getContentAsString();
		System.out.println(resultContent+"result");
		//assertEquals(expected, resultContent);
	}
//
//	@Test
//	public void testDeleteSearch() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetSearchById() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUpdateSearch() {
//		fail("Not yet implemented");
//	}

}
