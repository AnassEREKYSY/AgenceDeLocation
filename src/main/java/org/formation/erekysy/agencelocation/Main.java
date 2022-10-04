package org.formation.erekysy.agencelocation;

public class Main {

	public static void main(String[] args) throws VoitureDejaLouerException, HuileInsuffisasntException {
		Agence a=new Agence(new Voiture());
		a.acceuillir();

	}

}
