package org.formation.erekysy.agencelocation.model;

public class RendreVoitureAutreAgenceException extends Exception{

	public RendreVoitureAutreAgenceException() {
		System.out.println("Oups!! Vous etes tromp� d'agence cette voiture n'appartient pas l�");
	}

}
