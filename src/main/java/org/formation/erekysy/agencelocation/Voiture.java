package org.formation.erekysy.agencelocation;

import java.util.Scanner;
/**
 * classe Voiture represente la definition d'une voiture
 * @author hp
 *
 */
public class Voiture {
	
	private Moteur moteur;
	private boolean isValable=true; 

	/**
	 * constructeur de la classe Voiture
	 */
	public Voiture() {
		this.setMoteur(new Moteur());
		
	}
	/**
	 * methode demarer fait demarer le moteur de la voiture en afficheant l'etat des cylindres 
	 * et en testant si l'huile est suffisant ou pas
	 * @throws HuileInsuffisasntException
	 */
	public void demarer() throws HuileInsuffisasntException{
		if(getMoteur().getQuantite_huile()==0) {
			new HuileInsuffisasntException();
			Scanner sc=new Scanner(System.in);
			int a=0;
			while(a!=1) {
				System.out.println("Taper 1 pour changer l'huile:");
				a=sc.nextInt();
			} 
			boolean b=getMoteur().changer_huile();
			if(b) {
				System.out.println("Huile chang� avec succ�e!!\n");
			}
			String[] str=getMoteur().Etat_moteur();
			for(int i=0;i<str.length;i++) {
				System.out.println(str[i]); 
			}
			System.out.println("Etat d'huile: "+getMoteur().getQuantite_huile()+"\n");
			System.out.println("voiture d�mar�e\\n");
			getMoteur().setQuantite_huile(getMoteur().getQuantite_huile()-1);
		}else {
			String[] str=getMoteur().Etat_moteur();
			for(int i=0;i<str.length;i++) {
				System.out.println(str[i]);
			}
			System.out.println("Etat d'huile: "+getMoteur().getQuantite_huile()+"\n");
			System.out.println("voiture d�mar�e\n");
			getMoteur().setQuantite_huile(getMoteur().getQuantite_huile()-1);
		}
	}
	/**
	 * methode ouvrir le capot qui returne l'etat du moteur de la voiture
	 * @return
	 */
	public Moteur ouvrir_capot() {
		return getMoteur();
	}

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public boolean getIsValable() {
		return isValable;
	}
	public void setValable(boolean isValable) {
		this.isValable = isValable;
	}
}
