package com.thp.spring.vintud.dto;

public class CategoryDTO extends MyDTO {
	private int id;
	private String nom;
	private String description;

	

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CategoryDTO() {
		super();
	}



	public CategoryDTO(int id, String nom, String description) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
	}

	public CategoryDTO(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}


	@Override
	public String toString() {
		return "CategoryImpl [ nom=" + nom + ", description=" + description + "]";
	}
}
