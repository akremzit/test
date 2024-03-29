package com.thp.spring.vintud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity extends MyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_role")
	private int id;
	@Column(name = "nom")
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

	public RoleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleEntity(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "RoleEntity [id=" + id + ", nom=" + nom + "]";
	}

	public RoleEntity(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

}
