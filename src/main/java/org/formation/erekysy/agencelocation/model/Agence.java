package org.formation.erekysy.agencelocation.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.function.*;



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
	 * @param v voiture
	 */
	public Agence(String nom,ArrayList<Voiture> v) {
		this.setNom(nom);
		this.voiture=v;
	}
	
	/**
	 * Methode acceuillir qui montre un menu des choix au client passé par ses parametre
	 * @param client
	 * @throws VoituresDejaLouerException
	 * @throws HuileInsuffisasntException
	 */
	/*public void acceuillir(Client client,int choix) throws VoitureDejaLouerException, HuileInsuffisasntException, RendreVoitureAutreAgenceException, ClientNonLoueurException{
			switch(choix) {
				case 1:{
					System.out.println("----------------1-Location de voiture----------------");
					int cmpt=0;
					for(int i=0;i<getVoiture().size();i++) {
						if(getVoiture().get(i).getIsValable()==true) {
							client.louer(getVoiture().get(i));
							getHm().put(client.getNom(), getVoiture().get(i));
							cmpt++;
							System.out.println("Location faite avec succée, fait attention dans la route");
							break;
						}
					}
					if(cmpt==0) {
						new  VoitureDejaLouerException();
						break;
					}
					break;
				}
				case 2:{
					System.out.println("----------------2-Rendre une voiture----------------");
					if(client.getAlouer()==false) {
						new ClientNonLoueurException();
						break;
					}else {
						int cmpt=0;
						for(int i=0;i<getHm().size();i++) {
							if(getHm().containsKey(client.getNom())) {
								for(int j=0;j<getVoiture().size();j++) {
									if(getVoiture().get(i).equals(getHm().get(client.getNom()))) {
										getVoiture().set(j, getHm().get(client.getNom()));
										getVoiture().get(j).setValable(true);
									}
								}
								cmpt++;
								getHm().remove(client.getNom());
								client.rendre();
								System.out.println("c'est fait vous avez rendu la voiture merci à la prochaine");
								System.out.println("");
							}
						}
						if(cmpt==0) {
							new RendreVoitureAutreAgenceException();
							break;
						}
						break;
					} 
				}
				case 3:{
					System.out.println("----------------3-Ouvrir le capot----------------");
					if(client.getAlouer()==false) {
						new NonClientException();
						break;
					}else {
						for(int i=0;i<getHm().size();i++) {
							if(getHm().containsKey(client.getNom())) {
								Moteur m=getHm().get(client.getNom()).ouvrir_capot();
								String[] str=m.lancer();
								System.out.println("Vous avez un moteur de "+str.length+ " cylindres ");
								System.out.println("---Etat des cylindres---");
								for(int j=0;i<str.length;j++) {
									System.out.println(str[j]);
								}	
								break;
							}
						}
					}
				}
				case 4:{
					System.out.println("----------------Au revoire----------------");
					break;
				}
			}
	}
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
}
