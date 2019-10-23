package com.thp.spring.vintud.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.thp.spring.vintud.entity.AnnounceEntity;
import com.thp.spring.vintud.entity.UserEntity;

public class FavoriteDTO extends MyDTO {

	// @JsonBackReference
	private AnnounceEntity refAnnonce;
	// @JsonBackReference
	private UserEntity refUtilisateur;
	private Date refDate;

	public AnnounceEntity getRefAnnonce() {
		return refAnnonce;
	}

	public void setRefAnnonce(AnnounceEntity refAnnonce) {
		this.refAnnonce = refAnnonce;
	}

	public UserEntity getRefUtilisateur() {
		return refUtilisateur;
	}

	public void setRefUtilisateur(UserEntity refUtilisateur) {
		this.refUtilisateur = refUtilisateur;
	}

	public Date getRefDate() {
		return refDate;
	}

	public void setRefDate(Date refDate) {
		this.refDate = refDate;
	}

	@Override
	public String toString() {
		return "Favoris [refAnnonce=" + refAnnonce + ", refUtilisateur=" + refUtilisateur + ", refDate=" + refDate
				+ "]";
	}

	public FavoriteDTO(AnnounceEntity refAnnonce, UserEntity refUtilisateur, Date refDate) {
		super();

		this.refAnnonce = refAnnonce;
		this.refUtilisateur = refUtilisateur;
		this.refDate = refDate;
	}
	public FavoriteDTO(Date refDate) {
		super();

		
		this.refDate = refDate;
	}
	public FavoriteDTO() {
		super();

	}

}
