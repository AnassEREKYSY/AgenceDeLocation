package org.formation.erekysy.agencelocation.tests;

import org.formation.erekysy.agencelocation.model.Client;
import org.junit.Test;

import junit.framework.TestCase;

public class ClientTest extends TestCase {
	Client c=new Client("xxxx",18);
	
	/**
	 * Methode test si l'age du client est suppérieur à 18 ou pas
	 */
	@Test
	public void testClient() {
		assert c.getAge()>=18:"L age est accepté";
	}
}
