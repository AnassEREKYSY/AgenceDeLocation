package org.formation.erekysy.agencelocation;


public class Moteur {
	private Cylindre[] cylindre;
	
	public Moteur(int nombre_cylindre) {
		this.setCylindre(new Cylindre[nombre_cylindre]);
	}
	public Moteur() {
		this.setCylindre(new Cylindre[2]);
	}
	public Cylindre[] getCylindre() {
		return cylindre;
	}
	public void setCylindre(Cylindre[] cylindre) {
		this.cylindre = cylindre;
	}
	public void lancer() {
		for(int i=0;i<getCylindre().length;i++) {
			System.out.println("cylindre n° "+(i+1)+getCylindre()[i].afficher_etat());
		}
	}

}
