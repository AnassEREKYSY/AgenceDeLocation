package org.formation.erekysy.agencelocation.tests;

import org.formation.erekysy.agencelocation.Moteur;
import org.formation.erekysy.agencelocation.Voiture;

import junit.framework.TestCase;

public class VoitureTest extends TestCase{
	Voiture v=new Voiture();
	Moteur m=new Moteur();
	public void testCapot() {
		
		assert v.getMoteur().getClass().getName()=="Moteur":"c'est correcte";
	}
}
