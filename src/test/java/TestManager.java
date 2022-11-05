import static org.junit.jupiter.api.Assertions.*;

import org.formation.erekysy.agencelocation.controler.Manager;
import org.junit.jupiter.api.Test;

class TestManager {

	@Test
	void testLouer() {
		assertTrue(Manager.getInstance().louer() instanceof String[][]);
	}

	@Test
	void testRendre() {
		assertTrue(Manager.getInstance().rendre() instanceof String[]);
	}

	@Test
	void testConduire() {
		assertTrue(Manager.getInstance().conduire() instanceof String[]);
	}

}
