package org.formation.erekysy.agencelocation.model;
/**
 * Classe qui traitre l'exception quand le client n'a rien loué 
 * @author hp
 *
 */
public class ClientNonLoueurException extends Exception{

	public ClientNonLoueurException() {
		System.out.println("vous n avez rien a nous rendre par ce que vous n'avez pas louer une vehicule");
	}

}
