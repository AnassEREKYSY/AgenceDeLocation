import static org.junit.jupiter.api.Assertions.*;

import org.formation.erekysy.agencelocation.model.Moteur;
import org.formation.erekysy.agencelocation.model.Voiture;
import org.junit.jupiter.api.Test;

class TestVoiture {

	@Test
	void testDemarer() {
		Voiture v=new Voiture();
		assertTrue(v.demarer() instanceof String[]);
	}

	@Test
	void testOuvrir_capot() {
		Voiture v=new Voiture();
		assertTrue(v.ouvrir_capot() instanceof Moteur);
		
	}

}
