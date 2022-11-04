package org.formation.erekysy.agencelocation.controler;

import org.formation.erekysy.agencelocation.model.Agence;
import org.formation.erekysy.agencelocation.model.Client;
import org.formation.erekysy.agencelocation.model.HuileInsuffisasntException;
import org.formation.erekysy.agencelocation.model.RendreVoitureAutreAgenceException;
import org.formation.erekysy.agencelocation.model.Voiture;
import org.formation.erekysy.agencelocation.model.VoituresDejaLouerException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;



public class Manager {
	private static Manager instance=new Manager();
	private ArrayList<Client> clients;
	private ArrayList<Agence> agences;
	private ArrayList<Voiture> voitures1,voitures2;
	
	private Manager() {
		clients=new ArrayList<Client>();
		agences=new ArrayList<Agence>();
		voitures1=new ArrayList<Voiture>();
		voitures2=new ArrayList<Voiture>();
		init();	
	}
	private void init() {
		voitures1.add(new Voiture("BMW",1)); voitures1.add(new Voiture("Volkswagen",2));
		voitures1.add(new Voiture("Mercedes",3));
		
		voitures2.add(new Voiture("Jeep",4)); voitures2.add(new Voiture("Ferrari",5));
		voitures2.add(new Voiture("Rolls-Royce",6));
	
		agences.add(new Agence("agence1",voitures1));
		agences.add(new Agence("agence2",voitures2));
		
		for(int i=0;i<4;i++) {
			clients.add(new Client("c"+(i+1),(18+(i+1))));
		}
	}
	
	
	
	public static Manager getInstance() {
		return instance;
	}
	public static void setInstance(Manager instance) {
		Manager.instance = instance;
	}
	
	public String[][] louer(){
		String[][] st=new String[clients.size()][1];
		try {
			int j=0;
			for(int i=0;i<agences.size();i++) {
				for(int k=0;k<agences.get(i).getVoiture().size();k++) {
					if(j==4) {
						break;
					}else {
						st[j]=agences.get(i).acceuil(clients.get(j));
						j++;
					}
				}
			}
		}catch(VoituresDejaLouerException e) {}
		catch(HuileInsuffisasntException e) {}
		
		return st;
	}
	
	public String[] rendre(){
		String[] st=new String[clients.size()];
		try {
			int j=0;
			for(int i=0;i<agences.size();i++) {
				for(int k=0;k<agences.get(i).getVoiture().size();k++) {
					if(j==4) {
						break;
					}else {
						st[j]=agences.get(i).rendre(clients.get(j).getNom());
						j++;
					}
				}
			}
		}catch(RendreVoitureAutreAgenceException e) {}
		return st;
	}
	
	public String[] conduire(){
		String[] st=new String[clients.size()];
		for(int j=0;j<clients.size();j++) {
			st[j]=clients.get(j).conduire();
		}
		return st;
	}
	
	
	
	
	

}
