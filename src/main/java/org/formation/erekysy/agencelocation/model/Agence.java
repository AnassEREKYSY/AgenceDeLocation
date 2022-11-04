package org.formation.erekysy.agencelocation.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * La classe Agence c'est la classe qui represente la definition d'une agence
 * @author hp
 *
 */
public class Agence {
	private String nom;
	private ArrayList<Voiture> voiture;
	private HashMap<String,Voiture> hm=new HashMap<String,Voiture>();
	
	/**
	 * Constructeur de la classe Agence
	 * @param nom nom de l'agence
	 * @param v liste des voitures de l'agence
	 */
	public Agence(String nom,ArrayList<Voiture> v) {
		this.setNom(nom);
		this.voiture=v;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Voiture> getVoiture() {
		return voiture;
	}
	public void setVoiture(ArrayList<Voiture> voiture) {
		this.voiture = voiture;
	}
	
	public HashMap<String, Voiture> getHm() {
		return hm;
	}
	public void setHm(HashMap<String, Voiture> hm) {
		this.hm = hm;
	}
	
	
	/**
	 * Methode acceuil qui acceuillie un client passé par ses parametre et lui loue une voiture
	 * @param c client 
	 * @return tableau de String
	 * @throws HuileInsuffisasntException
	 * @throws VoituresDejaLouerException
	 */
	
	public String[] acceuil(Client c) throws HuileInsuffisasntException, VoituresDejaLouerException {
		Object[] res1=getVoiture().stream().filter(v->v.getIsValable()==true).toArray();
		String[] st=null;
		if(res1.length==0) {
			throw new VoituresDejaLouerException();
		}else {
			for(int i=0;i<res1.length;i++) {
				st=new String[c.louer((Voiture) res1[i]).length+1];
				st[0]="\n"+c.getNom()+" : La location est faite avec succées fait attention dans la route ("+this.getNom()+"--"+((Voiture) res1[i]).getMarque()+")\n";
				for(int k=1,j=0;k<st.length;k++,j++) {st[k]=c.louer((Voiture) res1[i])[j];}
				getHm().put(c.getNom(), (Voiture) res1[i]);
				break;
			}
		}
		return st;
	}
	
	/**
	 * Methode rendre responsable au faite que le client rend la voiture loué à l'agence
	 * @param nom nom du client
	 * @return String
	 * @throws RendreVoitureAutreAgenceException
	 */
	public String rendre(String nom) throws RendreVoitureAutreAgenceException {
		String str=null;
		int j=0;
		Set<String> key=getHm().keySet(); 
		Object[] res=key.stream().filter(n->n==nom).toArray();
		if(res.length==0) {
			throw new RendreVoitureAutreAgenceException();
		}else {
			for(int i=0;i<getVoiture().size();i++) {
				if(getVoiture().get(i)==getHm().get(nom)) {
					getHm().get(nom).setValable(true);
					getVoiture().set(i,getHm().get(nom));
					getHm().remove(nom);
					str= nom+" : c'est fait vous avez rendu la voiture merci à la prochaine ("+this.getNom()+")";
					break;
				}
			}
		}
		return str;
	}
	
}
