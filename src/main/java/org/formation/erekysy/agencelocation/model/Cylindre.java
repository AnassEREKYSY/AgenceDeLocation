package org.formation.erekysy.agencelocation.model;

import java.io.Serializable;

/**
 * Classe Cylindre represente la definition d'un cylindre
 * @author hp
 *
 */
public class Cylindre implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * methode qui return l'etat du cylindre "démaré"
	 * @return String
	 */
	public String afficher_etat() {
		return "démaré";  
	}
}
