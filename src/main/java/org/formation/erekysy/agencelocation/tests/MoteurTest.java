package org.formation.erekysy.agencelocation.tests;

import static org.junit.Assert.assertArrayEquals;

import org.formation.erekysy.agencelocation.Moteur;
import org.junit.Test;

import junit.framework.TestCase;

public class MoteurTest extends TestCase{
	Moteur m=new Moteur(); 
	String[] str=m.Etat_moteur();
	@Test
	public void testEtat_Moteur() {
		assertArrayEquals(m.Etat_moteur(), str);
	}
	
	@Test 
	public void testChanger_Huile() {
		assertEquals(true, m.changer_huile());
	}
}
