package com.thp.spring.vintud.service;

import java.util.List;

import com.thp.spring.vintud.dto.AnnounceDTO;
import com.thp.spring.vintud.entity.AnnounceEntity;

public interface AnnounceService {

	public void createAnnounce(AnnounceDTO announceDTO);
	public void deleteAnnounce(int idAnnounce);
	public List <AnnounceDTO> findAllAnnounce();
	public AnnounceDTO findAnnounceById(int id);
	public AnnounceEntity updateAnnounce(int id, AnnounceEntity announceEntity);
	public List <AnnounceDTO> findAnnonceByTitle(String title);
	public int findNbVueByUser(int idVendeur);
	public List<AnnounceDTO> findAnnounceByLocalisation(String localisation);
}
