package org.formation.erekysy.agencelocation.model;


/**
 * classe Voiture represente la definition d'une voiture
 * @author hp
 *
 */
public class Voiture extends Vehicule{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * constructeur de la classe Voiture
	 */
	public Voiture() {
		super();
	}
	/**
	 * constructeur avec parametre de la classe Voiture
	 * @param marque
	 * @param num
	 */
	public Voiture(String marque,double num) {
		super(marque,num);
	}
	
	
	@Override
	public String toString() {
		return "Voiture "+super.toString();
	}
	
	
}
