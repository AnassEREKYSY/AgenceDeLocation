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
		this.cylindre=new ArrayList<Cylindre>();
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
	public String[] Etat_moteur() {
		String[] str=new String[cylindre.size()];
		for(int i=0;i<str.length;i++) {
			str[i]= "cylindre n° "+(i+1)+" "+cylindre.get(i).afficher_etat();
		}	
		return str;
	}
	
	/**
	 * methode changer_huile fait changer l'huile du moteur
	 * @return true
	 */
	public boolean changer_huile() {
		setQuantite_huile(5);
		System.out.println("Huile changé avec succée!!\n");
		return true;
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
