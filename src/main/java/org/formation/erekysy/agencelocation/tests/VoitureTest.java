package org.formation.erekysy.agencelocation.tests;

import org.formation.erekysy.agencelocation.model.HuileInsuffisasntException;
import org.formation.erekysy.agencelocation.model.Moteur;
import org.formation.erekysy.agencelocation.model.Voiture;
import org.junit.Test;

import junit.framework.TestCase;

public class VoitureTest extends TestCase{
	Voiture v=new Voiture();
	Moteur m=new Moteur();
	
	/**
	 * methode qui teste si la methode ouvrir_capot return un moteur ou pas
	 */
	@Test
	public void testCapot() {
		assertEquals(v.ouvrir_capot() instanceof Moteur,true); 
	}
	
	
	/**
	 * methode qui teste si la methode demaré marche bien ou pas
	 */
	@Test
	public void testDemarer() throws HuileInsuffisasntException {
		assert v.demarer()== "voiture démarée\n":"c'est correcte voiture démarée";
	}
}
