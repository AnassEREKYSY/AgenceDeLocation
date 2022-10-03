package org.formation.erekysy.agencelocation;


public class Moteur {
	private Cylindre[] cylindre;
	private int quantite_huile=5;
	
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
	public int getQuantite_huile() {
		return quantite_huile;
	}
	public void setQuantite_huile(int quantite_huile) {
		this.quantite_huile=quantite_huile; 
	}
	public void setQuantite_huile() {
		this.quantite_huile--; 
	}
	
	public void lancer() {
		for(int i=0;i<getCylindre().length;i++) {
			System.out.println("cylindre n° "+(i+1)+getCylindre()[i].afficher_etat());
		}
	}
	public void changer_huile() {
		setQuantite_huile(5);
	}

}
