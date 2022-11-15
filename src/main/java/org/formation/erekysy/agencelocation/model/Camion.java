package org.formation.erekysy.agencelocation.model;

/**
 * classe Camion represente la definition d'un camion
 * @author hp
 *
 */
public class Camion extends Vehicule{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur avec parametre de la class Camion
	 * @param marque
	 * @param num
	 */
	public Camion(String marque,double num) {
		super(marque,num);
	}
	/**
	 *  Constructeur sans parametre de la class Camion
	 */
	public Camion() {
		super();
	}
	@Override
	public String toString() {
		return "Camion "+super.toString();
	}

}
