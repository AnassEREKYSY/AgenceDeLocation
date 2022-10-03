package org.formation.erekysy.agencelocation;

public class Client {
	private int age;
	private String nom,prenom;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void louer(Voiture v) throws HuileInsuffisasntException {
		v.demarer(new Moteur());
	}
	public void rendre() {
		
	}
}