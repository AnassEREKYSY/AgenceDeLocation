package org.formation.erekysy.agencelocation;

import java.util.ArrayList;
/**
 * classe Moteur represente la definition d'un moteur
 * @author hp
 *
 */
public class Moteur {
	private ArrayList<Cylindre> cylindre;
	private static int quantite_huile=5;
	
	/**
	 * constructeur de la classe Moteur
	 */
	public Moteur() {
		setCylindre(new ArrayList<Cylindre>());
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
	/**
	 * methode lancer est une methode qui affiche l'etat de chaque cylindre du moteur
	 */
	public void lancer() {
		for(int i=0;i<getCylindre().size();i++) {
			System.out.println("cylindre n° "+(i+1)+" "+getCylindre().get(i).afficher_etat());
		}
		System.out.println("Etat d'huile: "+quantite_huile+"\n");
	}
	/**
	 * methode changer_huile fait changer l'huile du moteur
	 */
	public void changer_huile() {
		setQuantite_huile(5);
		System.out.println("Huile changé avec succée!!\n");
	}
	
	/**
	 * methode changer cylindre fait changer le nombre de cylindre du moteur
	 * @param nb
	 */
	public void changer_cylindre(int nb) {
		if(getCylindre().size()==0) {
			for(int i=0;i<nb;i++) {
				getCylindre().add(i, new Cylindre());
			}
		}else {
			getCylindre().clear();
			for(int i=0;i<nb;i++) {
				getCylindre().add(i, new Cylindre());
			}
		}
		
	}

}
