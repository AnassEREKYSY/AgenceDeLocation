import static org.junit.jupiter.api.Assertions.*;

import org.formation.erekysy.agencelocation.model.Moteur;
import org.junit.jupiter.api.Test;

class TestMoteur {

	@Test
	void testLancer() {
		Moteur m=new Moteur();
		assertTrue(m.lancer() instanceof String[]);
	}

}
