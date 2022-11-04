package org.formation.erekysy.agencelocation.model;
/**
 * Classe qui traite l'exception du client qui rend la voiture louée à une autre agence
 * @author hp
 *
 */
public class RendreVoitureAutreAgenceException extends Exception{

	public RendreVoitureAutreAgenceException() {
		System.out.println("Oups!! Vous etes trompé d'agence cette voiture n'appartient pas là");
	}

}
