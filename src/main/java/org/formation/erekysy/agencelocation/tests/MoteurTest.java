package org.formation.erekysy.agencelocation.tests;

import static org.junit.Assert.assertArrayEquals;

import org.formation.erekysy.agencelocation.Moteur;
import org.junit.Test;

import junit.framework.TestCase;

public class MoteurTest extends TestCase{
	Moteur m=new Moteur(); 
	String[] str=m.Etat_moteur();
	
	/**
	 * methode qui teste le return de la methode Etat_moteur
	 */
	@Test
	public void testEtat_Moteur() {
		assertArrayEquals(m.Etat_moteur(), str);
	}
	
	/**
	 * methode qui teste si la methode changer_Huile marche bien ou pas
	 */
	@Test 
	public void testChanger_Huile() {
		assertEquals(true, m.changer_huile());
	}
}
