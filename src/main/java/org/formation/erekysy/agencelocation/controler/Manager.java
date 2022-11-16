package org.formation.erekysy.agencelocation.controler;

import org.formation.erekysy.agencelocation.model.Agence;
import org.formation.erekysy.agencelocation.model.Camion;
import org.formation.erekysy.agencelocation.model.Client;
import org.formation.erekysy.agencelocation.model.HuileInsuffisasntException;
import org.formation.erekysy.agencelocation.model.RendreVehiculeAutreAgenceException;
import org.formation.erekysy.agencelocation.model.Voiture;
import org.formation.erekysy.agencelocation.model.VehiculesDejaLouerException;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

/**
 * Classe qui represente le controller du projet
 * @author hp
 *
 */

public class Manager {
	private static Manager instance=new Manager();
	private ArrayList<Client> clients;
	private ArrayList<Agence> agences;
	private ArrayList<Voiture> vehicule1;
	private ArrayList<Camion> vehicule2;
	private ArrayList<Object> array=new ArrayList<Object>();
	/**
	 * Constructeur de la classe
	 */
	private Manager() {
		clients=new ArrayList<Client>();
		agences=new ArrayList<Agence>();
		vehicule1=new ArrayList<Voiture>();
		vehicule2=new ArrayList<Camion>();
		init();	
	}
	/**
	 * methode qui initialise les 3 listes de la classe 
	 */
	private void init() {
		vehicule1.add(new Voiture("BMW",1)); vehicule1.add(new Voiture("Volkswagen",2));
		vehicule1.add(new Voiture("Mercedes",3));
		
		vehicule2.add(new Camion("MAN",4)); vehicule2.add(new Camion("VOLVO",5));
		vehicule2.add(new Camion("Scania",6));
	
		agences.add(new Agence<Voiture>("agence1",vehicule1));
		agences.add(new Agence<Camion>("agence2",vehicule2));	
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
	public ArrayList<Object> getArray() {
		return array;
	}
	public void setArray(ArrayList<Object> array) {
		this.array = array;
	}
	/**
	 * methode qui permet d'enregistrer un objet passé par ses parametres dans un fichier (agencelocation.txt)
	 * @param obj ArrayList<Object> des objets à sauvgarder
	 */
	public void save(ArrayList<Object> obj) {
		
		Path p=Paths.get("C:\\Users\\hp\\Documents\\java\\agencelocation\\agencelocation.txt");
		try(OutputStream os=Files.newOutputStream(p)){
			ObjectOutputStream oos=new ObjectOutputStream(os);
			for(int i=0;i<obj.size();i++) {
				oos.writeObject(obj.get(i));
			}
		}catch(IOException e) {e.getMessage();}
	}
	
	
	/**
	 * methode qui lit le contenu du file agencelocation.txt
	 * @throws ClassNotFoundException 
	 * @return ArrayList<Object>
	 */
	
	public ArrayList<Object> read() throws ClassNotFoundException {
		ArrayList<Object> obj=new ArrayList<Object>();
		Path p=Paths.get("C:\\Users\\hp\\Documents\\java\\agencelocation\\agencelocation.txt");
		try(InputStream is=Files.newInputStream(p)){
			ObjectInputStream ois=new ObjectInputStream(is);
			
			while(ois.available()>=0) {
				obj.add(ois.readObject());
			}
		}catch(IOException e) {e.getMessage();}
		return obj;
	}
	
	/**
	 * methode qui fait un appel à la methode acceuil de chaque agence
	 * @return matrice de String
	 */
	public String[][] louer(){
		String[][] st=new String[clients.size()][1];
		try {
			int j=0;
			for(int i=0;i<agences.size();i++) {
				getArray().add(agences.get(i));
				for(int k=0;k<agences.get(i).getVehicule().size();k++) {
					if(j==clients.size()) {
						break;
					}else {
						st[j]=agences.get(i).acceuil(clients.get(j));
						getArray().add(clients.get(j));
						getArray().add(agences.get(i).getVehicule().get(k));
						j++;
					}
				}
			}
		}catch(VehiculesDejaLouerException e) {}
		catch(HuileInsuffisasntException e) {}
		save(array);
		return st;
	}
	/**
	 * methode qui fait un appel à la methode rendre de chaque agence
	 * @return tableau de String
	 */
	public String[] rendre(){
		String[] st=new String[clients.size()];
		try {
			int j=0;
			for(int i=0;i<agences.size();i++) {
				for(int k=0;k<agences.get(i).getVehicule().size();k++) {
					if(j==4) {
						break;
					}else {
						st[j]=agences.get(i).rendre(clients.get(j).getNom());
						j++;
					}
				}
			}
		}catch(RendreVehiculeAutreAgenceException e) {}
		return st;
	}
	/**
	 * methode qui fait un appel à la methode conduire de chaque client
	 * @return tableau de String
	 */
	public String[] conduire(){
		String[] st=new String[clients.size()];
		for(int j=0;j<clients.size();j++) {
			st[j]=clients.get(j).conduire();
		}
		return st;
	}
}
