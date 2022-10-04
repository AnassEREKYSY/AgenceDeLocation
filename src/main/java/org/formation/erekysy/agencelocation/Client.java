package org.formation.erekysy.agencelocation;

public class Client {
	private int age;
	private String nom,prenom;
	private boolean alouer=false;
	
	public Client(String n, int a) {
		setNom(n);
		setPrenom("xxx");
		setAge(a);
	}
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

	public void louer(Voiture v, int nb) throws HuileInsuffisasntException {
		v.demarer(new Moteur(nb));
		v.getMoteur().lancer();;
	}
	public void rendre() {
		setAlouer(false);
		
	}
	public boolean getAlouer() {
		return alouer;
	}
	public void setAlouer(boolean alouer) {
		this.alouer = alouer;
	}
}