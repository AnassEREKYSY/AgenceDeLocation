package org.formation.erekysy.agencelocation.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * La classe Agence c'est la classe qui represente la definition d'une agence
 * @author hp
 *
 */
public class Agence<T extends Vehicule> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private ArrayList<T> vehicule;
	private HashMap<String,T> hm=new HashMap<String,T>();
	
	/**
	 * Constructeur de la classe Agence
	 * @param nom nom de l'agence
	 * @param v liste des voitures de l'agence
	 */
	public Agence(String nom,ArrayList<T> v) {
		this.setNom(nom);
		this.vehicule=v;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<T> getVehicule() {
		return vehicule;
	}
	public void setVehicule(ArrayList<T> voiture) {
		this.vehicule = voiture;
	}
	
	public HashMap<String, T> getHm() {
		return hm;
	}
	public void setHm(HashMap<String, T> hm) {
		this.hm = hm;
	}
	
	
	/**
	 * Methode acceuil qui acceuillie un client passé par ses parametre et lui loue une voiture
	 * @param c client 
	 * @return tableau de String
	 * @throws HuileInsuffisasntException
	 * @throws VehiculesDejaLouerException
	 */
	
	public String[] acceuil(Client c) throws HuileInsuffisasntException, VehiculesDejaLouerException {
		String[] st=null;
			Object[] res1=getVehicule().stream().filter(v->((T) v).getIsValable()==true).toArray();
			if(res1.length==0) {
				throw new VehiculesDejaLouerException();
			}else {
				for(int i=0;i<res1.length;i++) {
					st=new String[c.louer((T) res1[i]).length+1];
					st[0]="\n"+c.getNom()+" : La location est faite avec succées fait attention dans la route ("+this.getNom()+"--"+((T) res1[i]).getMarque()+")\n";
					for(int k=1,j=0;k<st.length;k++,j++) {st[k]=c.louer((T) res1[i])[j];}
					getHm().put(c.getNom(), (T) res1[i]);
					break;
				}
			}
		
		return st;
	}
	
	
	
	/**
	 * Methode rendre responsable au faite que le client rend la voiture loué à l'agence
	 * @param nom nom du client
	 * @return String
	 * @throws RendreVehiculeAutreAgenceException
	 */
	public String rendre(String nom) throws RendreVehiculeAutreAgenceException {
		String str=null;
		int j=0;
		Set<String> key=getHm().keySet(); 
		Object[] res=key.stream().filter(n->n==nom).toArray();
		if(res.length==0) {
			throw new RendreVehiculeAutreAgenceException();
		}else {
			for(int i=0;i<getVehicule().size();i++) {
				if(getVehicule().get(i)==getHm().get(nom)) {
					((T) getHm().get(nom)).setValable(true);
					getVehicule().set(i,(T)getHm().get(nom));
					getHm().remove(nom);
					str= nom+" : c'est fait vous avez rendu ce que vous avez loué merci à la prochaine ("+this.getNom()+")";
					break;
				}
			}
		}
		return str;
	}

	@Override
	public String toString() {
		return "Agence [nom=" + nom + "]";
	}
	
	
	
}
