package com.thp.spring.vintud.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "favoris")
public class FavoriteEntity extends MyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@OneToOne
	@JoinColumn(name = "annonce_id")
	private AnnounceEntity refAnnonce;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private UserEntity refUtilisateur;
	@Column(name = "ref_date")
	private Date refDate;

	public FavoriteEntity() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
		return "Favoris [id=" + id + ", refAnnonce=" + refAnnonce + ", refUtilisateur=" + refUtilisateur + ", refDate="
				+ refDate + "]";
	}

	public FavoriteEntity(Long id, AnnounceEntity refAnnonce, UserEntity refUtilisateur, Date refDate) {
		super();
		this.id = id;
		this.refAnnonce = refAnnonce;
		this.refUtilisateur = refUtilisateur;
		this.refDate = refDate;
	}
	public FavoriteEntity( Date refDate) {
		super();
		
		this.refDate = refDate;
	}

	public FavoriteEntity(AnnounceEntity refAnnonce, UserEntity refUtilisateur, Date refDate) {
		super();
		this.refAnnonce = refAnnonce;
		this.refUtilisateur = refUtilisateur;
		this.refDate = refDate;
	}

}
