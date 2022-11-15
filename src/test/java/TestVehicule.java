import static org.junit.jupiter.api.Assertions.*;

import org.formation.erekysy.agencelocation.model.Moteur;
import org.formation.erekysy.agencelocation.model.Vehicule;
import org.formation.erekysy.agencelocation.model.Voiture;
import org.junit.jupiter.api.Test;

class TestVehicule {

	@Test
	void testDemarer() {
		Vehicule v=new Vehicule();
		assertTrue(v.demarer() instanceof String[]);
	}

	@Test
	void testOuvrir_capot() {
		Vehicule v=new Vehicule();
		assertTrue(v.ouvrir_capot() instanceof Moteur);
		
	}

}
 