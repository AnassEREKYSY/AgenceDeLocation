package org.formation.erekysy.agencelocation.view;

import java.util.ArrayList;

import org.formation.erekysy.agencelocation.controler.Manager;
import org.formation.erekysy.agencelocation.model.Agence;
import org.formation.erekysy.agencelocation.model.Client;
import org.formation.erekysy.agencelocation.model.HuileInsuffisasntException;
import org.formation.erekysy.agencelocation.model.RendreVoitureAutreAgenceException;
import org.formation.erekysy.agencelocation.model.Voiture;
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
	
	public void read() throws ClassNotFoundException {
		ArrayList<Object> obj=Manager.getInstance().read();
		for(int i=0;i<obj.size();i++) {
			if(obj.get(i).getClass().getName().compareTo("org.formation.erekysy.agencelocation.model.Voiture")==0) {
				System.out.println(((Voiture)obj.get(i)).toString());
			}else if(obj.get(i).getClass().getName().compareTo("org.formation.erekysy.agencelocation.model.Client")==0) {
				System.out.println(((Client)obj.get(i)).toString());
			}else {
				System.out.println(((Agence)obj.get(i)).toString());
			}
			//System.out.println(obj.get(i).toString());
		}
	}

}
