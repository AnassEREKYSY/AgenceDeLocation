package org.formation.erekysy.agencelocation;

import java.util.ArrayList;

public class Moteur {
	private ArrayList<Cylindre> cylindre;
	private static int quantite_huile=5;
	
	
	public Moteur(int nombre_cylindre) {
		cylindre = new ArrayList<Cylindre>(nombre_cylindre);
	}
	public ArrayList<Cylindre> getCylindre() {
		return cylindre;
	}
	public void setCylindre(ArrayList<Cylindre> cylindre) {
		this.cylindre = cylindre;
	}
	public int getQuantite_huile() {
		return quantite_huile;
	}
	public void setQuantite_huile(int quantite_huile) {
		Moteur.quantite_huile=quantite_huile; 
	}
	
	public void lancer() {
		for(int i=0;i<getCylindre().size();i++) {
			if(getCylindre().get(i)!=null) {
				System.out.println("cylindre n° "+(i+1)+" "+getCylindre().get(i).afficher_etat());
			}
		}
		System.out.println("Etat d'huile: "+quantite_huile+"\n");
	}
	public void changer_huile() {
		setQuantite_huile(5);
		System.out.println("Huile changé avec succée!!\n");
	}
	
	public void changer_cylindre(int nb) {
		for(int i=0;i<nb;i++) {
			getCylindre().add(new Cylindre());
		}
	}

}
