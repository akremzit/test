package com.thp.spring.vintud.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.vintud.dto.AnnounceDTO;
import com.thp.spring.vintud.entity.AnnounceEntity;
import com.thp.spring.vintud.helper.ModelMapperConverter;
import com.thp.spring.vintud.helper.ResourceNotFoundException;
import com.thp.spring.vintud.repository.AnnounceRepository;
import com.thp.spring.vintud.service.AnnounceService;

@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service
public class AnnounceServiceImpl implements AnnounceService {

	@Autowired
	AnnounceRepository announceRepository;

	@Override
	public void createAnnounce(AnnounceDTO announceDTO) {
		AnnounceEntity announceEntity = ModelMapperConverter.converToEntity(announceDTO, AnnounceEntity.class);
		announceRepository.save(announceEntity);
	}

	@Override
	public void deleteAnnounce(int idAnnounce) {
		announceRepository.deleteById(idAnnounce);
	}

	@Override
	public List<AnnounceDTO> findAllAnnounce() {

		return ModelMapperConverter.convertAllToDTO(announceRepository.findAll(), AnnounceDTO.class);
	}

	@Override
	public AnnounceDTO findAnnounceById(int id) {
		return ModelMapperConverter.converToDTO(announceRepository.findById(id).orElse(null), AnnounceDTO.class);
	}


	@Override
	public AnnounceEntity updateAnnounce(int idAnnounce, AnnounceEntity announceEntity) throws ResourceNotFoundException{
		AnnounceEntity announceEntity2 = announceRepository.findById(idAnnounce)
				.orElseThrow(() -> new ResourceNotFoundException("Note", "idAnnounce", idAnnounce));
		
		 AnnounceEntity updateAnnounce = announceRepository.save(announceEntity2);
		 return updateAnnounce;
	}

	@Override
	public List<AnnounceDTO> findAnnonceByTitle(String title) {
		return ModelMapperConverter.convertAllToDTO(announceRepository.findByTitre(title), AnnounceDTO.class);
	}

	@Override
	public int findNbVueByUser(int idVendeur) {
		return announceRepository.findNbVueByVendeurId(idVendeur);
	}

	@Override
	public List<AnnounceDTO> findAnnounceByLocalisation(String localisation) {
		return ModelMapperConverter.convertAllToDTO(announceRepository.findByLocalisation(localisation), AnnounceDTO.class);
	}

}
