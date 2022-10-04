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
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int nb=0,reponse=0;
		while(reponse!=3) {
			System.out.println("\n1-Location de voiture");
			System.out.println("2-Rendre une voiture");
			System.out.println("3-Quitter\n");
			reponse=sc.nextInt();
			switch(reponse) {
				case 1:{
					System.out.println("----------------1-Location de voiture----------------");
					if(getVoiture().getIsValable()==false) {
						new VoitureDejaLouerException();
					}else {
						while(nb<2) {
							System.out.println("Vous voulez combien de cylindres dans votre voiture? (2+):");
							nb=sc.nextInt();
							getVoiture().getMoteur().changer_cylindre(nb);
						}
						nb=0;
						getVoiture().setValable(false);
						client.setAlouer(true);
						client.louer(getVoiture());
					}
					break;
				}
				case 2:{
					System.out.println("----------------2-Rendre une voiture----------------");
					getVoiture().setValable(true);
					client.rendre();
					System.out.println("c'est fait vous avez rendu la voiture merci");
					System.out.println("");
					break;
				}
				case 3:{
					System.out.println("----------------Au revoire----------------");
					break;
				}
			}

		}
		
		
	}
}
