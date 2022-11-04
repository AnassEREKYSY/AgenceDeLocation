package org.formation.erekysy.agencelocation.model;

/**
 * classe Voiture represente la definition d'une voiture
 * @author hp
 *
 */
public class Voiture {
	
	private String marque;
	private double numero_serie;
	private Moteur moteur;
	private boolean isValable=true; 

	/**
	 * constructeur de la classe Voiture
	 */
	public Voiture() {
		this.setMoteur(new Moteur());
		this.setMarque("marque");
		this.setNumero_serie(0);
		this.isValable=true;
	}
	public Voiture(String marque,double num) {
		this.setMoteur(new Moteur());
		this.setMarque(marque);
		this.setNumero_serie(num);
		this.isValable=true;
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
	public double getNumero_serie() {
		return numero_serie;
	}
	public void setNumero_serie(double numero_serie) {
		this.numero_serie = numero_serie;
	}
	
	
	
	/**
	 *  methode demarer fait demarer le moteur de la voiture 
	 * et en testant si l'huile est suffisant ou pas
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
	 * methode ouvrir le capot qui returne l'etat du moteur de la voiture
	 * @return
	 */
	public Moteur ouvrir_capot() {
		return getMoteur();
	}
}
