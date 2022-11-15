import static org.junit.jupiter.api.Assertions.*;

import org.formation.erekysy.agencelocation.model.Voiture;
import org.junit.jupiter.api.Test;

class TestVoiture {

	@Test
	void testToString() {
		Voiture v = new Voiture();
		assertEquals(v.toString(), "Voiture "+"[marque=" + v.getMarque() + ", numero_serie=" + v.getNumero_serie() + ", moteur=" + v.getMoteur() + ", isValable="+ v.getIsValable() + "]");

	}

}
