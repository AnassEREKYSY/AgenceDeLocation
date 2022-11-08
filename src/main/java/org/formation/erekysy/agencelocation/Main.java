package org.formation.erekysy.agencelocation;


import org.formation.erekysy.agencelocation.model.HuileInsuffisasntException;
import org.formation.erekysy.agencelocation.model.RendreVoitureAutreAgenceException;
import org.formation.erekysy.agencelocation.model.VoituresDejaLouerException;
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
	 * @throws VoituresDejaLouerException
	 * @throws RendreVoitureAutreAgenceException
	 * @throws ClassNotFoundException 
	 */
	public void go() throws HuileInsuffisasntException, VoituresDejaLouerException, RendreVoitureAutreAgenceException, ClassNotFoundException {
		
		view.louer();
		System.out.println("\n----------------la location est faite----------------\n");
		view.conduire();
		System.out.println("\n----------------les clients conduisent les voitures----------------\n");
		view.rendre();
		System.out.println("\n----------------les clients ont rendu les voitures louées----------------\n");
		System.out.println("\n");
		System.out.println("\n----------------liste des objets suavgarder dans agencelocation.txt----------------\n");
		view.read();
		
	}
	public static void main(String[] args) throws VoituresDejaLouerException, HuileInsuffisasntException, RendreVoitureAutreAgenceException, ClassNotFoundException {
				
		Main m=new Main();
		m.go();

	}
}
