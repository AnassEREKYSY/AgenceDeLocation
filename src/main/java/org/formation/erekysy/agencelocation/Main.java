package org.formation.erekysy.agencelocation;


import org.formation.erekysy.agencelocation.model.HuileInsuffisasntException;
import org.formation.erekysy.agencelocation.model.RendreVehiculeAutreAgenceException;
import org.formation.erekysy.agencelocation.model.VehiculesDejaLouerException;
import org.formation.erekysy.agencelocation.view.View;
/**
 * La classe main qui contient la methode main qui fait tourner le programme
 * @author hp
 *
 */
public class Main {
	
	private View view;
	
	/**
	 * constructeur de la classe main
	 */
	public Main() {
		this.view=new View();
	}

	/**
	 * methode qui appelle les methode du view
	 * @throws HuileInsuffisasntException
	 * @throws VehiculesDejaLouerException
	 * @throws RendreVehiculeAutreAgenceException
	 * @throws ClassNotFoundException 
	 */
	public void go() throws HuileInsuffisasntException, VehiculesDejaLouerException, RendreVehiculeAutreAgenceException, ClassNotFoundException {
		System.out.println("\t\t\t\t ********Agence de location******** \n");
		
		System.out.println("\n\t\t\t----------------la location des voitures----------------\n");
		view.louer();
		System.out.println("\n\t\t\t----------------la location est faite----------------\n");
		System.out.println("\t\t------------les données sont sauvgardées dans un fichier------------\n");
		
		System.out.println("\n\t\t\t----------------Conduction des voitures----------------\n");
		view.conduire();
		System.out.println("\n\t\t\t------------les clients conduisent les voitures------------\n");
		
		System.out.println("\n\t\t\t----------------le rend des voitures louées----------------\n");
		view.rendre();
		System.out.println("\n\t\t\t----------les clients ont rendu les voitures louées---------\n");
		System.out.println("\n");
		System.out.println("\t\t\t*************************Historique*************************");
		System.out.println("\n\t\t----------liste des objets suavgarder dans agencelocation.txt------------\n");
		view.read();
		
	}
	public static void main(String[] args) throws VehiculesDejaLouerException, HuileInsuffisasntException, RendreVehiculeAutreAgenceException, ClassNotFoundException {
				
		Main m=new Main();
		m.go();

	}
}
