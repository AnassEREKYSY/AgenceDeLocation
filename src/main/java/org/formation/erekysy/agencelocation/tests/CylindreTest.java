package org.formation.erekysy.agencelocation.tests;

import org.formation.erekysy.agencelocation.Cylindre;
import org.junit.Test;

import junit.framework.TestCase;

public class CylindreTest  extends TestCase{
	Cylindre c=new Cylindre();
	@Test 
	public void testCylindre() {
		assertEquals("d�mar�",c.afficher_etat());
	}
}
