package org.formation.erekysy.agencelocation;

public class Voiture {
	
	private Moteur moteur;
	private int nombre_cylindre;
	public Voiture() {
		this.setMoteur(new Moteur());
	}
	public Voiture(int nombre_cylindre) {
		this.setMoteur(new Moteur(nombre_cylindre));
	}

	public void demarer(Moteur m) {
		System.out.println("voiture démarée");
		m.lancer();
	}
	
	public Moteur ouvrir_capot() {
		return getMoteur();
	}

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public int getNombre_cylindre() {
		return nombre_cylindre;
	}

	public void setNombre_cylindre(int nombre_cylindre) {
		this.nombre_cylindre = nombre_cylindre;
	}
}
