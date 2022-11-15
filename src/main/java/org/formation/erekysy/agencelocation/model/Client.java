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
	private String ce_que_jai_loue;
	
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
	public String getCe_que_jai_loue() {
		return ce_que_jai_loue;
	}
	public void setCe_que_jai_loue(String ce_que_jai_loue) {
		this.ce_que_jai_loue = ce_que_jai_loue;
	}
	
	/**
	 * methode louer qui fait louer une vehicule au client 
	 * @param v Voiture
	 * @return tableau de String
	 * @throws HuileInsuffisasntException
	 */
	public String[] louer(Vehicule v) throws HuileInsuffisasntException {
		if(v instanceof Voiture ) {
			setCe_que_jai_loue("la voiture");
		}else {
			setCe_que_jai_loue("le camion");
		}
		v.setValable(false);
		setAlouer(true);
		return v.demarer();
	}
	/**
	 * methode rendre qui fait rendre la vehicule louer par le client
	 * @param a Agence
	 * @throws RendreVehiculeAutreAgenceException
	 */
	public void rendre(Agence<?> a) throws RendreVehiculeAutreAgenceException {
		setAlouer(false);
		a.rendre(getNom());
		
	}
	/**
	 * methode conduire qui retourne un String
	 * @return String
	 */
	public String conduire() {
		return " Je conduit "+getCe_que_jai_loue()+" que j'ai loué !!";
	}
	@Override
	public String toString() {
		return "Client [age=" + age + ", nom=" + nom + ", alouer=" + alouer + "]";
	}
	
	
}