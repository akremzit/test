package com.thp.spring.vintud.dto;


import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.List;

import com.thp.spring.vintud.entity.AnnounceEntity;
import com.thp.spring.vintud.entity.FavoriteEntity;
import com.thp.spring.vintud.entity.RoleEntity;



public class UserDTO extends MyDTO {

	private int id;
	private String mail;
	private String prenom;
	private String nom;
	private String pseudo;
	private String motDePasse;
	private Long numTel;
	private String adresse;
	@JsonBackReference
	private List<AnnounceEntity> annoncesPostes;
	@JsonBackReference
	private List<FavoriteEntity> annoncesFavori;
	private RoleEntity role;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Long getNumTel() {
		return numTel;
	}

	public void setNumTel(Long numTel) {
		this.numTel = numTel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<AnnounceEntity> getAnnoncesPostes() {
		return annoncesPostes;
	}

	public void setAnnoncesPostes(List<AnnounceEntity> annoncesPostes) {
		this.annoncesPostes = annoncesPostes;
	}

	public List<FavoriteEntity> getAnnoncesFavori() {
		return annoncesFavori;
	}

	public void setAnnoncesFavori(List<FavoriteEntity> annoncesFavori) {
		this.annoncesFavori = annoncesFavori;
	}

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

	public UserDTO(int id, String mail, String prenom, String nom, String pseudo, String motDePasse, Long numTel,

			String adresse, List<AnnounceEntity> annoncesPostes, List<FavoriteEntity> annoncesFavori, RoleEntity role) {

		super();
		this.id = id;
		this.mail = mail;
		this.prenom = prenom;
		this.nom = nom;
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.numTel = numTel;
		this.adresse = adresse;
		this.annoncesPostes = annoncesPostes;
		this.annoncesFavori = annoncesFavori;
		this.role = role;
	}

	public UserDTO(String mail, String prenom, String nom, String pseudo, String motDePasse, Long numTel,

			String adresse, List<AnnounceEntity> annoncesPostes, List<FavoriteEntity> annoncesFavori, RoleEntity role) {

		super();
		this.mail = mail;
		this.prenom = prenom;
		this.nom = nom;
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.numTel = numTel;
		this.adresse = adresse;
		this.annoncesPostes = annoncesPostes;
		this.annoncesFavori = annoncesFavori;
		this.role = role;
	}

	public UserDTO() {
		super();

	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", mail=" + mail + ", prenom=" + prenom + ", nom=" + nom + ", pseudo=" + pseudo
				+ ", motDePasse=" + motDePasse + ", numTel=" + numTel + ", adresse=" + adresse + ", annoncesPostes="
				+ annoncesPostes + ", annoncesFavori=" + annoncesFavori + ", role=" + role + "]";
	}

}
