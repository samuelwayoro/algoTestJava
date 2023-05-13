package com.algotestjava.model;

public class User {
	private int id;
	private String nom;
	private String prenoms;
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
	public String getPrenoms() {
		return prenoms;
	}
	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenoms=" + prenoms + "]";
	}
	public User(int id, String nom, String prenoms) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenoms = prenoms;
	}
	public User() {
	}
	
	
	
}
