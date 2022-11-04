package org.formation.erekysy.agencelocation.view;

import java.util.ArrayList;

import org.formation.erekysy.agencelocation.controler.Manager;
import org.formation.erekysy.agencelocation.model.HuileInsuffisasntException;
import org.formation.erekysy.agencelocation.model.RendreVoitureAutreAgenceException;
import org.formation.erekysy.agencelocation.model.VoituresDejaLouerException;

public class View {

	public View() {
	}
	
	public void louer() throws HuileInsuffisasntException, VoituresDejaLouerException {
		String[][] st=Manager.getInstance().louer();
		for(int i=0;i<st.length;i++) {
			for(int j=0;j<st[i].length;j++) {
				System.out.print(st[i][j].toString());
			}
			System.out.println("\n__________________________________\n");
		}
	}
	public void rendre() throws RendreVoitureAutreAgenceException {
		String[] st=Manager.getInstance().rendre();
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i].toString());
		}
	}
	public void conduire() {
		String[] st=Manager.getInstance().conduire();
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i].toString());
		}
	}

}
