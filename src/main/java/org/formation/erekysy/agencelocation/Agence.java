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
	
	public void acceuillir(Client client) throws VoitureDejaLouerException, HuileInsuffisasntException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Bonjour et bienvenu dans l'agence de location des voiture:");
		System.out.println("voulez-vous louer une voiture:");
		sc.nextLine();
		if(getVoiture().getIsValable()==false) {
			if(client.getAlouer()==true) {
				client.rendre();
			}else {
				new VoitureDejaLouerException();
			}
		}else {
			System.out.println("Pouvez vous me donner votre nom pour valider la location:");
			String nom=sc.nextLine();
			Client c =new Client(nom,age);
			getVoiture().setValable(false);
			client.louer(getVoiture());
			client.setAlouer(true);
		}
		
	}
}
