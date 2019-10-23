package com.thp.spring.vintud.entity;

import java.sql.Date;
import java.util.Arrays;

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

import com.thp.spring.vintud.util.Statut;

@Entity
@Table(name = "announcement")
public class AnnounceEntity extends MyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "titre")
	private String titre;
	@Column(name = "description")
	private String description;
	@ManyToOne
	@JoinColumn(name = "categorie_id")
	private CategoryEntity categorie;
	@Column(name = "photo")
	private byte[] photo;
	@Column(name = "prix")
	private float prix;
	@Column(name = "date_pub")
	private Date datePub;
	@Enumerated(EnumType.STRING)
	@Column(name = "statut")
	private Statut statut;
	@Column(name = "etat_dis")
	private boolean etatDis;
	@Column(name = "nb_vue")
	private int nbVue;
	@Column(name = "localisation")
	private String localisation;

	@ManyToOne
	@JoinColumn(name = "vendeur_id")
	private UserEntity vendeur;

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

	public UserEntity getVendeur() {
		return vendeur;
	}

	public void setVendeur(UserEntity vendeur) {
		this.vendeur = vendeur;
	}

	public AnnounceEntity() {
		super();
	}

	public AnnounceEntity(int id, String titre, String description, CategoryEntity categorie, byte[] photo, float prix,
			Date datePub, Statut statut, boolean etatDis, int nbVue, String localisation, UserEntity vendeur) {
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
		this.vendeur = vendeur;
	}

	public AnnounceEntity(String titre, String description, CategoryEntity categorie, byte[] photo, float prix,
			Date datePub, Statut statut, boolean etatDis, int nbVue, String localisation, UserEntity vendeur) {
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
		this.vendeur = vendeur;
	}

	@Override
	public String toString() {
		return "AnnouncementImp [id=" + id + ", titre=" + titre + ", description=" + description + ", categorie="
				+ categorie + ", photo=" + Arrays.toString(photo) + ", prix=" + prix + ", datePub=" + datePub
				+ ", statut=" + statut + ", etatDis=" + etatDis + ", nbVue=" + nbVue + ", localisation=" + localisation
				+ ", vendeur=" + vendeur + "]";
	}

}
