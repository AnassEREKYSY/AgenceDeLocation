package org.formation.erekysy.agencelocation;

import java.util.Scanner;

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
	
	public void acceuillir() throws VoitureDejaLouerException, HuileInsuffisasntException{
		Scanner sc=new Scanner(System.in);
		Client c ;
		System.out.println("Bonjour et bienvenu dans l'agence de location des voiture:");
		System.out.println("voulez-vous louer une voiture:");
		sc.nextLine();
		System.out.println("Pouvez vous me donner votre nom pour valider la location:");
		String nom=sc.nextLine();
		System.out.println("Pouvez vous me donner votre age pour valider la location:");
		int age=sc.nextInt();
		c =new Client(nom,age);
		int nb=0;
		while(nb<2) {
			System.out.println("Vous voulez combien de cylindres dans votre voiture? (2+):");
			nb=sc.nextInt();
		}
		if(getVoiture().getIsValable()==false) {
			if(c.getAlouer()==true) {
				c.rendre();
			}else {
				new VoitureDejaLouerException();
			}
		}else {
			getVoiture().setValable(false);
			c.louer(getVoiture(),nb);
			c.setAlouer(true);
		}
		
	}
}
