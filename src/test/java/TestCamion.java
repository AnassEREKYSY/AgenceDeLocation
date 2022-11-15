import static org.junit.jupiter.api.Assertions.*;

import org.formation.erekysy.agencelocation.model.Camion;
import org.junit.jupiter.api.Test;

class TestCamion {

	@Test
	void testToString() {
		Camion c= new Camion();
		assertEquals(c.toString(), "Camion "+"[marque=" + c.getMarque() + ", numero_serie=" + c.getNumero_serie() + ", moteur=" + c.getMoteur() + ", isValable="+ c.getIsValable() + "]");
	}

}
