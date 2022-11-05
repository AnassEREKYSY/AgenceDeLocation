import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.formation.erekysy.agencelocation.model.Agence;
import org.formation.erekysy.agencelocation.model.Client;
import org.formation.erekysy.agencelocation.model.HuileInsuffisasntException;
import org.formation.erekysy.agencelocation.model.RendreVoitureAutreAgenceException;
import org.formation.erekysy.agencelocation.model.Voiture;
import org.formation.erekysy.agencelocation.model.VoituresDejaLouerException;
import org.junit.jupiter.api.Test;

class TestAgence {

	@Test
	void testAcceuil() throws HuileInsuffisasntException, VoituresDejaLouerException {
		ArrayList<Voiture> voitures=new ArrayList<Voiture>();
		voitures.add(new Voiture("Jeep",4)); voitures.add(new Voiture("Ferrari",5));
		voitures.add(new Voiture("Rolls-Royce",6));
		Agence a=new Agence("",voitures);
		assertTrue(a.acceuil(new Client("",19)) instanceof String[]);
		assertDoesNotThrow(()->{a.acceuil(new Client("",18));});
	}

	@Test
	void testRendre()  {
		ArrayList<Voiture> voitures=new ArrayList<Voiture>();
		voitures.add(new Voiture("Jeep",4)); voitures.add(new Voiture("Ferrari",5));
		voitures.add(new Voiture("Rolls-Royce",6));
		Agence a=new Agence("",voitures);
		Client c=new Client("",18);
		try {
			assertTrue(a.rendre(c.getNom()) instanceof String);
		} catch (RendreVoitureAutreAgenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThrows(RendreVoitureAutreAgenceException.class,()->{a.rendre(c.getNom());});
	}

}
