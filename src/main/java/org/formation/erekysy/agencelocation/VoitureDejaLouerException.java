package org.formation.erekysy.agencelocation;
/**
 * classe qui gere l'exception des voiture non valable quand le client veut louer
 * @author hp
 *
 */
public class VoitureDejaLouerException extends Exception {


	public VoitureDejaLouerException() {
		System.out.println("Oups!! la voiture est déjà louée");
	}
}
