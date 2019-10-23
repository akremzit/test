package com.thp.spring.vintud.dto;

public class RoleDTO extends MyDTO {

	private int id;
	private String nom;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "RoleDTO [id=" + id + ", nom=" + nom + "]";
	}

	public RoleDTO(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public RoleDTO(String nom) {
		super();
		this.nom = nom;
	}

	public RoleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
