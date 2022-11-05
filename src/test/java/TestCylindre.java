import static org.junit.jupiter.api.Assertions.*;

import org.formation.erekysy.agencelocation.model.Cylindre;
import org.junit.jupiter.api.Test;

class TestCylindre {

	@Test
	void testAfficher_etat() {
		Cylindre cl=new Cylindre();
		assertEquals(cl.afficher_etat(),"démaré");
	}

}
