package org.formation.erekysy.agencelocation.view;

import org.formation.erekysy.agencelocation.controler.Manager;
import org.formation.erekysy.agencelocation.model.HuileInsuffisasntException;
import org.formation.erekysy.agencelocation.model.RendreVoitureAutreAgenceException;
import org.formation.erekysy.agencelocation.model.VoituresDejaLouerException;
/**
 * classe qui represente le vue du projet
 * @author hp
 *
 */
public class View {

	/**
	 * Constructeur de la classe
	 */
	public View() {
	}
	
	/**
	 * methode qui appelle la methode louer du controller
	 * @throws HuileInsuffisasntException
	 * @throws VoituresDejaLouerException
	 */
	public void louer() throws HuileInsuffisasntException, VoituresDejaLouerException {
		String[][] st=Manager.getInstance().louer();
		for(int i=0;i<st.length;i++) {
			for(int j=0;j<st[i].length;j++) {
				System.out.print(st[i][j].toString());
			}
			System.out.println("\n__________________________________\n");
		}
	}
	/**
	 * methode qui appelle la methode rendre du controller
	 * @throws RendreVoitureAutreAgenceException
	 */
	public void rendre() throws RendreVoitureAutreAgenceException {
		String[] st=Manager.getInstance().rendre();
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i].toString());
		}
	}
	/**
	 * methode qui appelle la methode conduire du controller
	 */
	public void conduire() {
		String[] st=Manager.getInstance().conduire();
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i].toString());
		}
	}

}
