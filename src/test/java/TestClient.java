import static org.junit.jupiter.api.Assertions.*;

import org.formation.erekysy.agencelocation.model.Client;
import org.formation.erekysy.agencelocation.model.HuileInsuffisasntException;
import org.formation.erekysy.agencelocation.model.Voiture;

import junit.framework.TestCase;

public class TestClient extends TestCase {

	public void testLouer() throws HuileInsuffisasntException {
		Client c=new Client("xxx",18);
		assertFalse(c.getAlouer());
		assertTrue(c.louer(new Voiture()) instanceof String[]);
		assertDoesNotThrow(()->{c.louer(new Voiture());});
	}

	public void testRendre() {
		
	}

	public void testConduire() {
		Client c=new Client("xxx",18);
		assertEquals(c.conduire()," Je conduit la voiture que j'ai lou� !!");
	}

}
