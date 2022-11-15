package org.formation.erekysy.agencelocation.model;
/**
 * classe qui gere l'exception des voiture non valables quand le client veut louer
 * @author hp
 *
 */
public class VehiculesDejaLouerException extends Exception {


	public VehiculesDejaLouerException() {
		System.out.println("Oups!! tous nos vehicules sont louées pour l'instant");
	}
}
