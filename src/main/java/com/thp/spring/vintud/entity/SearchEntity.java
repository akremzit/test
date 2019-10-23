package com.thp.spring.vintud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.thp.spring.vintud.util.ArticleType;
import com.thp.spring.vintud.util.Size;

@Entity
@Table(name = "recherche")
public class SearchEntity extends MyEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Enumerated(EnumType.STRING)
	@Column(name = "taille")
	private Size taille;
	@Enumerated(EnumType.STRING)
	@Column(name = "type_habit")
	private ArticleType typeHabit;
	@Column(name = "couleur")
	private String couleur;
	@Column(name = "prix_min")
	private double prix_min;
	@Column(name = "prix_max")
	private double prix_max;
	@ManyToOne
	@JoinColumn(name = "user_id")
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

	public SearchEntity(int id, Size taille, ArticleType typeHabit, String couleur, double prix_min, double prix_max,
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

	public SearchEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Recherche [id=" + id + ", taille=" + taille + ", typeHabit=" + typeHabit + ", couleur=" + couleur
				+ ", prix_min=" + prix_min + ", prix_max=" + prix_max + ", user=" + user + "]";
	}

}
