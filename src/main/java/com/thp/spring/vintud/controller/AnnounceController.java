package com.thp.spring.vintud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.vintud.dto.AnnounceDTO;
import com.thp.spring.vintud.service.AnnounceService;

@RestController(value = "/announce")
@CrossOrigin
public class AnnounceController {

	@Autowired
	AnnounceService announceServiceimpl;;

	@PostMapping(value = "/announce")
	public void createAnnounce(@RequestBody AnnounceDTO announceDTO) {
		announceServiceimpl.createAnnounce(announceDTO);
	}

	@PutMapping(value = "/announce")
	public void updateUser(@RequestBody AnnounceDTO announceDTO) {
		announceServiceimpl.createAnnounce(announceDTO);
	}
	@GetMapping(value = "/announce")
	public List<AnnounceDTO> getAllAnnounce() {
		return announceServiceimpl.findAllAnnounce();
	}

	@GetMapping(value = "/announce/{idAnnounce}", produces = MediaType.APPLICATION_JSON_VALUE)
	public AnnounceDTO getAnnounceById(@PathVariable int idAnnounce) {
		return announceServiceimpl.findAnnounceById(idAnnounce);
	}

	@DeleteMapping(value = "/announce/{idAnnounce}")
	public void deleteAnnounce(@PathVariable int idAnnounce) {
		announceServiceimpl.deleteAnnounce(idAnnounce);
	}
	
	@GetMapping(value = "/announceTitle")
	public List<AnnounceDTO> getAnnonceByTitle(@RequestParam String title){
		return announceServiceimpl.findAnnonceByTitle(title);
	}
	
	@GetMapping(value = "/announceVue/{idVendeur}")
	public int getNbVueAnnounce(@PathVariable int idVendeur) {
		return announceServiceimpl.findNbVueByUser(idVendeur);
	}
	
	@GetMapping(value = "/announceLocalisation")
	public List<AnnounceDTO> getNbVueAnnounce(@RequestParam String localisation) {
		return announceServiceimpl.findAnnounceByLocalisation(localisation);
	}
			
}
