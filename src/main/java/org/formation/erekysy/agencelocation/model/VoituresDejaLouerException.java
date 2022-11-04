package org.formation.erekysy.agencelocation.model;
/**
 * classe qui gere l'exception des voiture non valables quand le client veut louer
 * @author hp
 *
 */
public class VoituresDejaLouerException extends Exception {


	public VoituresDejaLouerException() {
		System.out.println("Oups!! tous nos voitures sont louées pour l'instant");
	}
}
