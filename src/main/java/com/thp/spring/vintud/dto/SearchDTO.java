package com.thp.spring.vintud.dto;

import com.thp.spring.vintud.entity.UserEntity;
import com.thp.spring.vintud.util.ArticleType;
import com.thp.spring.vintud.util.Size;

public class SearchDTO extends MyDTO {

	private int id;
	private Size taille;
	private ArticleType typeHabit;
	private String couleur;
	private double prix_min;
	private double prix_max;
	private UserEntity user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Size getTaille() {
		return taille;
	}

	public void setTaille(Size taille) {
		this.taille = taille;
	}

	public ArticleType getTypeHabit() {
		return typeHabit;
	}

	public void setTypeHabit(ArticleType typeHabit) {
		this.typeHabit = typeHabit;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public double getPrix_min() {
		return prix_min;
	}

	public void setPrix_min(double prix_min) {
		this.prix_min = prix_min;
	}

	public double getPrix_max() {
		return prix_max;
	}

	public void setPrix_max(double prix_max) {
		this.prix_max = prix_max;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public SearchDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchDTO(Size taille, ArticleType typeHabit, String couleur, double prix_min, double prix_max,
			UserEntity user) {
		super();
		this.taille = taille;
		this.typeHabit = typeHabit;
		this.couleur = couleur;
		this.prix_min = prix_min;
		this.prix_max = prix_max;
		this.user = user;
	}

	public SearchDTO(int id, Size taille, ArticleType typeHabit, String couleur, double prix_min, double prix_max,
			UserEntity user) {
		super();
		this.id = id;
		this.taille = taille;
		this.typeHabit = typeHabit;
		this.couleur = couleur;
		this.prix_min = prix_min;
		this.prix_max = prix_max;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Recherche [id=" + id + ", taille=" + taille + ", typeHabit=" + typeHabit + ", couleur=" + couleur
				+ ", prix_min=" + prix_min + ", prix_max=" + prix_max + ", user=" + user + "]";
	}
}
