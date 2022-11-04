package org.formation.erekysy.agencelocation;

import java.util.Scanner;

import org.formation.erekysy.agencelocation.model.AgeBasException;
import org.formation.erekysy.agencelocation.model.Agence;
import org.formation.erekysy.agencelocation.model.Client;
import org.formation.erekysy.agencelocation.model.HuileInsuffisasntException;
import org.formation.erekysy.agencelocation.model.RendreVoitureAutreAgenceException;
import org.formation.erekysy.agencelocation.model.Voiture;
import org.formation.erekysy.agencelocation.model.VoituresDejaLouerException;
import org.formation.erekysy.agencelocation.view.View;
/**
 * La classe main qui contient la methode main qui fait tourner le programme
 * @author hp
 *
 */
public class Main {
	
	private View view;
	
	public Main() {
		this.view=new View();
	}

	public void go() throws HuileInsuffisasntException, VoituresDejaLouerException, RendreVoitureAutreAgenceException {
		
		view.louer();
		System.out.println("\n----------------la location est faite----------------\n");
		view.conduire();
		System.out.println("\\n----------------les clients conduisent les voitures----------------\\n");
		view.rendre();
		System.out.println("\\n----------------les clients ont rendu les voitures louées----------------\\n");
		
	}
	public static void main(String[] args) throws VoituresDejaLouerException, HuileInsuffisasntException, AgeBasException, RendreVoitureAutreAgenceException {
		
		
		Main m=new Main();
		m.go();
		/*Agence agence=new Agence(new Voiture());
		
		Scanner sc=new Scanner(System.in);
		int nb=0,reponse=0;
		while(reponse!=4) {
			System.out.println("\n1-Location de voiture");
			System.out.println("2-Rendre une voiture");
			System.out.println("3-Ouvrir le capot");
			System.out.println("4-Quitter\n");
			reponse=sc.nextInt();
			agence.acceuillir(null, reponse);
		}
		
		
		
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("****---Bonjour et bienvenu dans l'agence de location des voiture---****\n");
		System.out.println("Pouvez vous me donner votre nom:");
		String nom=sc.nextLine();
		System.out.println("Pouvez vous me donner votre age:");
		int age=sc.nextInt();
		if(age<18) {
			new AgeBasException();
			System.out.println("Pouvez vous me donner votre age:");
			age=sc.nextInt();
			Client client=new Client(nom,age);
			agence.acceuillir(client);
		}else {
			Client client=new Client(nom,age);
			agence.acceuillir(client);
		}
	}
	*/

}
}
