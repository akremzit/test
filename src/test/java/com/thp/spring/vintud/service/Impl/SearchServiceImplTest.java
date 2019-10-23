/**
 * 
 */
package com.thp.spring.vintud.service.Impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.thp.spring.vintud.dto.SearchDTO;
import com.thp.spring.vintud.service.SearchService;
import com.thp.spring.vintud.util.ArticleType;
import com.thp.spring.vintud.util.Size;

/**
 * @author nlimayem
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchServiceImplTest {
	
	@Autowired
	private SearchService searchService  ;

	@Test
	public void testAddSearch() {

		SearchDTO searchDTO = new SearchDTO(Size.M, ArticleType.ROBE, "couleur", 20.0, 50.0, null);
		searchService.addSearch(searchDTO);

		assertNotNull(searchService.findSearchById(5));
	}

	/**
	 * Test method for
	 * {@link com.thp.spring.vintud.service.Impl.SearchServiceImpl#findAllSearch()}.
	 */
	@Test
	public void testFindAllSearch() {
		int LongListExpected = 4;
		searchService.findAllSearch();
		int result = searchService.findAllSearch().size();
		assertNotNull(searchService.findAllSearch());
		assertEquals(LongListExpected, result);
	}

	/**
	 * Test method for
	 * {@link com.thp.spring.vintud.service.Impl.SearchServiceImpl#findSearchById(int)}.
	 */
	@Test
	public void testFindSearchById() {
		int id = 2;
		SearchDTO searchDTOExpected = new SearchDTO(Size.M, ArticleType.ROBE, "couleur", 20.0, 50.0, null);
		SearchDTO result = searchService.findSearchById(id);
		assertNotNull(searchService.findSearchById(id));

		assertEquals(searchDTOExpected, result);
	}

	/**
	 * Test method for
	 * {@link com.thp.spring.vintud.service.Impl.SearchServiceImpl#deleteSearch(int)}.
	 */
	@Test
	public void testDeleteSearch() {
		int id = 2;
		searchService.deleteSearch(id);
		//assert(searchService.findSearchById(id));


	}

	/**
	 * Test method for
	 * {@link com.thp.spring.vintud.service.Impl.SearchServiceImpl#updateSearch(int, com.thp.spring.vintud.dto.SearchDTO)}.
	 */
	@Test
	public void testUpdateSearch() {
		int id = 3;
		SearchDTO searchDTOExpected = new SearchDTO(Size.L, ArticleType.ROBE, "couleur", 20.0, 50.0, null);
		searchService.updateSearch(id, searchDTOExpected);

		assertEquals(searchDTOExpected, searchService.findSearchById(id));
	}

}
