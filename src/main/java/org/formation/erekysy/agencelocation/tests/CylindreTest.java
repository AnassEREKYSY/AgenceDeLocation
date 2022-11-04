package org.formation.erekysy.agencelocation.tests;

import org.formation.erekysy.agencelocation.model.Cylindre;
import org.junit.Test;

import junit.framework.TestCase;

public class CylindreTest  extends TestCase{
	Cylindre c=new Cylindre();
	/**
	 * methode test le return de la methode afficher_etat de la classe Cylindre
	 */
	@Test 
	public void testCylindre() {
		assertEquals("démaré",c.afficher_etat());
	}
}
