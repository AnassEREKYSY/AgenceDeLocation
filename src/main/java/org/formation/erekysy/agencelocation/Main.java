package org.formation.erekysy.agencelocation;

import java.util.Scanner;
/**
 * La classe main qui contient la methode main qui fait tourner le programme
 * @author hp
 *
 */
public class Main {

	public static void main(String[] args) throws VoitureDejaLouerException, HuileInsuffisasntException, AgeBasException {
		Agence agence=new Agence(new Voiture());
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

}
