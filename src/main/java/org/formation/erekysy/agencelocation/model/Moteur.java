package org.formation.erekysy.agencelocation.model;

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
		this.cylindre=new ArrayList<Cylindre>();
		init();
	}
	/**
	 * methode qui initialise les cylindres du moteur
	 */
	public void init() {
		for(int i=0;i<12;i++) {
			cylindre.add(i, new Cylindre());
		}
	}
	public int getQuantite_huile() {
		return quantite_huile;
	}
	public void setQuantite_huile(int quantite_huile) {
		Moteur.quantite_huile=quantite_huile; 
	}
	
	/**
	 * methode qui affiche l'etat du moteur et l'etat de ses cylindres
	 * @return tableau de String
	 */
	public String[] lancer() {
		String[] str=new String[cylindre.size()+1];
		str[0]="---voiture démarée---\n";
		for(int i=1,j=0;i<str.length;i++,j++) {
			if(j%3==0) {
				str[i]= "\n\t---cylindre n° "+(i)+" "+cylindre.get(j).afficher_etat()+"---";
			}
			else {
				str[i]= "\t---cylindre n° "+(i)+" "+cylindre.get(j).afficher_etat()+"---";
			}
		}	
		return str;
	}
	
	/**
	 * methode changer cylindre fait changer le nombre de cylindre du moteur
	 * @param nb
	 */
	public void changer_cylindre(int nb) {
		if(cylindre.size()==0) {
			for(int i=0;i<nb;i++) {
				cylindre.add(i, new Cylindre());
			}
		}else {
			cylindre.clear();
			for(int i=0;i<nb;i++) {
				cylindre.add(i, new Cylindre());
			}
		}
	}
}
