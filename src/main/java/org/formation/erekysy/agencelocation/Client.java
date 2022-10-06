package org.formation.erekysy.agencelocation;
/**
 * La classe client contient la definition du client
 * @author hp
 *
 */
public class Client {
	private int age;
	private String nom,prenom;
	private boolean alouer=false;
	
	/**
	 * Constructeur de la classe Client
	 * @param n le nom
	 * @param a l'age
	 */
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
	public boolean getAlouer() {
		return alouer;
	}
	public void setAlouer(boolean alouer) {
		this.alouer = alouer;
	}
	/**
	 * methode louer qui fait louer une voiture au client 
	 * @param v voiture
	 * @throws HuileInsuffisasntException
	 */
	public void louer(Voiture v) throws HuileInsuffisasntException {
		String s=v.demarer();
		System.out.println(s);
		v.setValable(false);
		setAlouer(true);
	}
	/**
	 * methode rendre qui fait rendre la voiture louer par l client
	 */
	public void rendre() {
		setAlouer(false);
	}
}