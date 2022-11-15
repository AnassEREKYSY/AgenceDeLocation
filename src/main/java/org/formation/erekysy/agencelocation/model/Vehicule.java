package org.formation.erekysy.agencelocation.model;

import java.io.Serializable;
/**
 * Classe vehicule presente la definition d'une vehicule
 * @author hp
 *
 * @param <T>
 */
public class Vehicule  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String marque;
	private double numero_serie;
	private Moteur moteur;
	private boolean isValable=true; 
	
	
	public double getNumero_serie() {
		return numero_serie;
	}
	public void setNumero_serie(double numero_serie) {
		this.numero_serie = numero_serie;
	}
	public Moteur getMoteur() {
		return moteur;
	}
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	public boolean getIsValable() {
		return isValable;
	}
	public void setValable(boolean isValable) {
		this.isValable = isValable;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	

	/**
	 * Constructeur avec parametre de la classe Vehicule
	 * @param marque
	 * @param num
	 */
	public Vehicule(String marque,double num) {
		this.setMoteur(new Moteur());
		this.setMarque(marque);
		this.setNumero_serie(num);
		this.isValable=true;
	}
	/**
	 *  Constructeur sans parametre de la classe Vehicule
	 */
	public Vehicule() {
		this.setMoteur(new Moteur());
		this.setMarque("marque");
		this.setNumero_serie(0);
		this.isValable=true;
	}
	
	/**
	 * methode demarer fait demarer le moteur du vehicule et en testant si l'huile est suffisant ou pas
	 * @return tableau de String
	 */
	public String[] demarer() {
		if(getMoteur().getQuantite_huile()==0) {
			getMoteur().setQuantite_huile(5);
			//throw new HuileInsuffisasntException();
		}
		getMoteur().setQuantite_huile(getMoteur().getQuantite_huile()-1);
		return getMoteur().lancer();
	}
	
	/**
	 * methode ouvrir le capot qui returne l'etat du moteur du vehicule
	 * @return
	 */
	public Moteur ouvrir_capot() {
		return getMoteur();
	}
	
	@Override
	public String toString() {
		return "[marque=" + marque + ", numero_serie=" + numero_serie + ", moteur=" + moteur + ", isValable="
				+ isValable + "]";
	}

}
