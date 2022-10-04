package org.formation.erekysy.agencelocation;

import java.util.Scanner;

public class Voiture {
	
	private Moteur moteur;
	private int nombre_cylindre;
	private boolean isValable=true;

	public Voiture(int nombre_cylindre) {
		this.setMoteur(new Moteur(nombre_cylindre));
		
	}

	public void demarer() throws HuileInsuffisasntException{
		if(getMoteur().getQuantite_huile()==0) {
			new HuileInsuffisasntException();
			Scanner sc=new Scanner(System.in);
			int a=0;
			while(a!=1) {
				System.out.println("Taper 1 pour changer l'huile:");
				a=sc.nextInt();
			}
			getMoteur().changer_huile();
			System.out.println("voiture démarée\\n");
			getMoteur().setQuantite_huile(getMoteur().getQuantite_huile()-1);
			getMoteur().lancer();
		}else {
			System.out.println("voiture démarée\n");
			getMoteur().setQuantite_huile(getMoteur().getQuantite_huile()-1);
			getMoteur().lancer();
		}
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
	public boolean getIsValable() {
		return isValable;
	}
	public void setValable(boolean isValable) {
		this.isValable = isValable;
	}
}
