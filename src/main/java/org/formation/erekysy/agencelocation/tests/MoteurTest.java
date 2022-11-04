package org.formation.erekysy.agencelocation.tests;

import static org.junit.Assert.assertArrayEquals;

import org.formation.erekysy.agencelocation.model.Moteur;
import org.junit.Test;

import junit.framework.TestCase;

public class MoteurTest extends TestCase{
	Moteur m=new Moteur(); 
	String[] str=m.lancer();
	
	/**
	 * methode qui teste le return de la methode Etat_moteur
	 */
	@Test
	public void testEtat_Moteur() {
		assertArrayEquals(m.lancer(), str);
	}
	
	
}
