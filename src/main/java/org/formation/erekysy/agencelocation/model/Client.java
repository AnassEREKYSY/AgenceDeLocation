package org.formation.erekysy.agencelocation.model;

import java.io.Serializable;

/**
 * La classe client contient la definition du client
 * @author hp
 *
 */
public class Client implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	private String nom;
	private boolean alouer=false;
	
	/**
	 * Constructeur de la classe Client
	 * @param n le nom
	 * @param a l'age
	 */
	public Client(String n, int a) {
		setNom(n);
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
	public boolean getAlouer() {
		return alouer;
	}
	public void setAlouer(boolean alouer) {
		this.alouer = alouer;
	}
	
	/**
	 * methode louer qui fait louer une voiture au client 
	 * @param v Voiture
	 * @return tableau de String
	 * @throws HuileInsuffisasntException
	 */
	public String[] louer(Voiture v) throws HuileInsuffisasntException {
		v.setValable(false);
		setAlouer(true);
		return v.demarer();
	}
	/**
	 * methode rendre qui fait rendre la voiture louer par le client
	 * @param a Agence
	 * @throws RendreVoitureAutreAgenceException
	 */
	public void rendre(Agence a) throws RendreVoitureAutreAgenceException {
		setAlouer(false);
		a.rendre(getNom());
		
	}
	/**
	 * methode conduire qui retourne un String
	 * @return String
	 */
	public String conduire() {
		return " Je conduit la voiture que j'ai loué !!";
	}
}