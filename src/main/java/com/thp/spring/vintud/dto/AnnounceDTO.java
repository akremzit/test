package com.thp.spring.vintud.dto;

import java.sql.Date;
import java.util.Arrays;

import com.thp.spring.vintud.entity.CategoryEntity;
import com.thp.spring.vintud.util.Statut;



public class AnnounceDTO extends MyDTO {
	private int id;
	private String titre;
	private String description;
	private CategoryEntity categorie;
	private byte[] photo;
	private float prix;
	private Date datePub;
	private Statut statut;
	private boolean etatDis;
	private int nbVue;
	private String localisation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CategoryEntity getCategorie() {
		return categorie;
	}

	public void setCategorie(CategoryEntity categorie) {

		this.categorie = categorie;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Date getDatePub() {
		return datePub;
	}

	public void setDatePub(Date datePub) {
		this.datePub = datePub;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public boolean isEtatDis() {
		return etatDis;
	}

	public void setEtatDis(boolean etatDis) {
		this.etatDis = etatDis;
	}

	public int getNbVue() {
		return nbVue;
	}

	public void setNbVue(int nbVue) {
		this.nbVue = nbVue;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public AnnounceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnnounceDTO(String titre, String description, CategoryEntity categorie, byte[] photo, float prix,
			Date datePub, Statut statut, boolean etatDis, int nbVue, String localisation) {
		super();
		this.titre = titre;
		this.description = description;
		this.categorie = categorie;
		this.photo = photo;
		this.prix = prix;
		this.datePub = datePub;
		this.statut = statut;
		this.etatDis = etatDis;
		this.nbVue = nbVue;
		this.localisation = localisation;
	}

	public AnnounceDTO(int id, String titre, String description, CategoryEntity categorie, byte[] photo, float prix,
			Date datePub, Statut statut, boolean etatDis, int nbVue, String localisation) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.categorie = categorie;
		this.photo = photo;
		this.prix = prix;
		this.datePub = datePub;
		this.statut = statut;
		this.etatDis = etatDis;
		this.nbVue = nbVue;
		this.localisation = localisation;
	}

	
	public AnnounceDTO(int id, String titre) {
		super();
		this.id = id;
		this.titre = titre;
	}

	public AnnounceDTO(String titre) {
		super();
		this.titre = titre;
	}

	@Override
	public String toString() {
		return "AnnouncementImp [id=" + id + ", titre=" + titre + ", description=" + description + ", categorie="
				+ categorie + ", photo=" + Arrays.toString(photo) + ", prix=" + prix + ", datePub=" + datePub
				+ ", statut=" + statut + ", etatDis=" + etatDis + ", nbVue=" + nbVue + ", localisation=" + localisation
				+ "]";
	}

}
