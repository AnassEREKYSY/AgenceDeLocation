package org.formation.erekysy.agencelocation.model;
/**
 * Classe qui traite l'exception du client qui rend la voiture lou�e � une autre agence
 * @author hp
 *
 */
public class RendreVoitureAutreAgenceException extends Exception{

	public RendreVoitureAutreAgenceException() {
		System.out.println("Oups!! Vous etes tromp� d'agence cette voiture n'appartient pas l�");
	}

}
