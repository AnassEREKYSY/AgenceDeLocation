package org.formation.erekysy.agencelocation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws VoitureDejaLouerException, HuileInsuffisasntException {
		Agence agence=new Agence(new Voiture(2));
		Scanner sc=new Scanner(System.in);
		System.out.println("****---Bonjour et bienvenu dans l'agence de location des voiture---****\n");
		System.out.println("Pouvez vous me donner votre nom:");
		String nom=sc.nextLine();
		System.out.println("Pouvez vous me donner votre age:");
		int age=sc.nextInt();
		Client client=new Client(nom,age);
		agence.acceuillir(client);

	}

}
