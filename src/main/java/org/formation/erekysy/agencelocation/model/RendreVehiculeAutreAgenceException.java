package org.formation.erekysy.agencelocation.model;
/**
 * Classe qui traite l'exception du client qui rend la voiture lou�e � une autre agence
 * @author hp
 *
 */
public class RendreVehiculeAutreAgenceException extends Exception{

	public RendreVehiculeAutreAgenceException() {
		System.out.println("Oups!! Vous etes tromp� d'agence cette vehicule n'appartient pas l�");
	}

}
