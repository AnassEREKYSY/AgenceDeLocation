package org.formation.erekysy.agencelocation;

public class Agence {
	private Voiture voiture;
	public Agence(Voiture v) {
		this.setVoiture(v);
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	
	public void acceuillir() {
		
	}
}
