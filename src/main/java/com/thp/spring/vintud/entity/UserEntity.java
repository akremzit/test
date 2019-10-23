package com.thp.spring.vintud.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "myuser")
public class UserEntity extends MyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int id;
	@Column(name = "mail")
	private String mail;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "nom")
	private String nom;
	@Column(name = "pseudo", nullable = false)
	private String pseudo;
	@Column(name = "mot_de_passe", nullable = false)
	private String motDePasse;
	@Column(name = "num_tel")
	private Long numTel;
	@Column(name = "adresse")
	private String adresse;
	@OneToMany(mappedBy = "vendeur")
	private List<AnnounceEntity> annoncesPostes;
	@OneToMany(mappedBy = "refUtilisateur")
	private List<FavoriteEntity> annoncesFavori;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "profile", joinColumns = {
			@JoinColumn(name = "idUser", referencedColumnName = "id_user") }, inverseJoinColumns = {
					@JoinColumn(name = "idRole", referencedColumnName = "id_role") })
	private Set<RoleEntity> roles = new HashSet<>();

	@OneToMany(mappedBy = "user")

	private List<SearchEntity> recherche;

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

	public Set<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleEntity> roles) {
		this.roles = roles;
	}

	public List<SearchEntity> getRecherche() {
		return recherche;
	}

	public void setRecherche(List<SearchEntity> recherche) {
		this.recherche = recherche;
	}

	public UserEntity(int id, String mail, String prenom, String nom, String pseudo, String motDePasse, Long numTel,
			String adresse, List<AnnounceEntity> annoncesPostes, List<FavoriteEntity> annoncesFavori,
			Set<RoleEntity> roles, List<SearchEntity> recherche) {
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
		this.roles = roles;
		this.recherche = recherche;
	}

	public UserEntity(String mail, String prenom, String nom, String pseudo, String motDePasse, Long numTel,
			String adresse, List<AnnounceEntity> annoncesPostes, List<FavoriteEntity> annoncesFavori,
			Set<RoleEntity> roles, List<SearchEntity> recherche) {
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
		this.roles = roles;
		this.recherche = recherche;
	}

	public UserEntity() {
		super();
	}

	public UserEntity(String pseudo, String motDePasse) {
		super();
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", mail=" + mail + ", prenom=" + prenom + ", nom=" + nom + ", pseudo=" + pseudo
				+ ", motDePasse=" + motDePasse + ", numTel=" + numTel + ", adresse=" + adresse + ", annoncesPostes="
				+ annoncesPostes + ", annoncesFavori=" + annoncesFavori + ", roles=" + roles + ", recherche="
				+ recherche + "]";
	}

}
