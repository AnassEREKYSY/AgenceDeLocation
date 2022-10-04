package org.formation.erekysy.agencelocation;

public class Main {

	public static void main(String[] args) throws VoitureDejaLouerException, HuileInsuffisasntException {
		Client c=new Client();
		Agence a=new Agence(new Voiture());
		a.acceuillir(c);

	}

}
