package org.formation.erekysy.agencelocation;

import java.util.Scanner;

/**
 * La classe Agence c'est la classe qui represente la definition d'une agence
 * @author hp
 *
 */
public class Agence {
	private Voiture voiture;
	
	/**
	 * Constructeur de la classe Agence
	 * @param v voiture
	 */
	public Agence(Voiture v) {
		this.setVoiture(v);
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	
	/**
	 * Methode acceuillir qui montre un menu des choix au client passé par ses parametre
	 * @param client
	 * @throws VoitureDejaLouerException
	 * @throws HuileInsuffisasntException
	 */
	public void acceuillir(Client client) throws VoitureDejaLouerException, HuileInsuffisasntException{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int nb=0,reponse=0;
		while(reponse!=4) {
			System.out.println("\n1-Location de voiture");
			System.out.println("2-Rendre une voiture");
			System.out.println("3-Ouvrir le capot");
			System.out.println("4-Quitter\n");
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
						client.louer(getVoiture());
						System.out.println("Location faite avec succée, fait attention dans la route");
					}
					break;
				}
				case 2:{
					System.out.println("----------------2-Rendre une voiture----------------");
					if(client.getAlouer()==false) {
						System.out.println("vous n avez rien a nous rendre taper 1 si vous voulez louer une voiture");
						break;
					}else {
						getVoiture().setValable(true);
						client.rendre();
						System.out.println("c'est fait vous avez rendu la voiture merci à la prochaine");
						System.out.println("");
						break;
					} 
				}
				case 3:{
					System.out.println("----------------3-Ouvrir le capot----------------");
					if(client.getAlouer()==false) {
						new NonClientException();
						break;
					}else {
						Moteur m=getVoiture().ouvrir_capot();
						String[] str=m.Etat_moteur();
						System.out.println("Vous avez un moteur de "+str.length+ " cylindres ");
						System.out.println("---Etat des cylindres---");
						for(int i=0;i<str.length;i++) {
							System.out.println(str[i]);
						}	
						break;
					}
				}
				case 4:{
					System.out.println("----------------Au revoire----------------");
					break;
				}
			}

		}
		
		
	}
}
