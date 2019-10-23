package com.thp.spring.vintud.service.Impl;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.vintud.dto.AnnounceDTO;
import com.thp.spring.vintud.service.AnnounceService;

@Transactional
@Rollback(true)
@SpringBootTest
class AnnounceServiceImplTest {

	@Autowired
	AnnounceService announceService;

//	@Test
//	void testCreateAnnounce() {
//		List<AnnounceDTO> annonces1 = announceService.findAllAnnounce();
//		AnnounceDTO announce = new AnnounceDTO("test5");
//		announceService.createAnnounce(announce);
//        List<AnnounceDTO> annonces2 = announceService.findAllAnnounce();
//        assertEquals((annonces1.size()+1), annonces2.size());
//		
//	}

	@Test
	void testDeleteAnnounce() {
		List<AnnounceDTO> annonces1 = announceService.findAllAnnounce();
		announceService.deleteAnnounce(2);
		List<AnnounceDTO> annonces2 = announceService.findAllAnnounce();
		assertNotEquals(annonces1.size(), annonces2.size());
	}

//	@Test
//	void testFindAllAnnounce() {
//		List<AnnounceDTO> annonces = announceService.findAllAnnounce();
//		assertNotNull(annonces);
//}

//	@Test
//	void testFindAnnounceById() {
//        AnnounceDTO annonce = announceService.findAnnounceById(3);
//      assertNotNull(annonce);
//	}
//
//	@Test
//	void testUpdateAnnounce() {

//		AnnounceDTO announce = new AnnounceDTO(3,"test2");
//		announceService.createAnnounce(announce);
//		AnnounceDTO announce1 = announceService.findAnnounceById(3);
//		assertEquals(announce1.getTitre(), "test2");
//	}

}
