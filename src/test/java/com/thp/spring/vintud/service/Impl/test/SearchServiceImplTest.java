package com.thp.spring.vintud.service.Impl.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.thp.spring.vintud.entity.SearchEntity;
import com.thp.spring.vintud.repository.SearchRepository;
import com.thp.spring.vintud.service.SearchService;
import com.thp.spring.vintud.util.ArticleType;
import com.thp.spring.vintud.util.Size;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchServiceImplTest {

	@Autowired
	private SearchService searchService;
	@MockBean
	SearchRepository SearchRepository;

	@Test
	public void testFindAllSearch() {
		when(SearchRepository.findAll()).thenReturn(Stream
				.of(new SearchEntity(4, Size.M, ArticleType.ROBE, "couleur", 20.0, 50.0, null),
						new SearchEntity(4, Size.M, ArticleType.ROBE, "couleur", 20.0, 50.0, null))
				.collect(Collectors.toList()));

		assertEquals(2, searchService.findAllSearch().size());
	}

}
