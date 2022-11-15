package org.formation.erekysy.agencelocation.model;
/**
 * Classe qui traite l'exception du client qui veut ouvrir le capot d'une voiture qui n'a pas loué
 * @author hp
 *
 */
public class NonClientException extends Exception{
	public NonClientException() {
		System.out.println("Attention!! Pour ouvrir le capot de la vehicule il faut que tu la loue");
	}

}
