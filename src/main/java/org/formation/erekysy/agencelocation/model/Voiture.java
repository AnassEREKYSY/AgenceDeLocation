package org.formation.erekysy.agencelocation.model;

/**
 * classe Voiture represente la definition d'une voiture
 * @author hp
 *
 */
public class Voiture {
	
	private String marque;
	private double numero_serie;
	private Moteur moteur;
	private boolean isValable=true; 

	/**
	 * constructeur de la classe Voiture
	 */
	public Voiture() {
		this.setMoteur(new Moteur());
		this.setMarque("marque");
		this.setNumero_serie(0);
		this.isValable=true;
	}
	public Voiture(String marque,double num) {
		this.setMoteur(new Moteur());
		this.setMarque(marque);
		this.setNumero_serie(num);
		this.isValable=true;
	}
	/**
	 * methode demarer fait demarer le moteur de la voiture en afficheant l'etat des cylindres 
	 * et en testant si l'huile est suffisant ou pas
	 * @throws HuileInsuffisasntException
	 */
	/*public String demarer() throws HuileInsuffisasntException{
		if(getMoteur().getQuantite_huile()==0) {
			new HuileInsuffisasntException();
			Scanner sc=new Scanner(System.in);
			int a=0;
			while(a!=1) {
				System.out.println("Taper 1 pour changer l'huile:");
				a=sc.nextInt();
			} 
			getMoteur().setQuantite_huile(5);
			System.out.println("Huile changé avec succée!!\n");
			String[] str=getMoteur().lancer();
			for(int i=0;i<str.length;i++) {
				System.out.println(str[i]); 
			}
			System.out.println("Etat d'huile: "+getMoteur().getQuantite_huile()+"\n");
			getMoteur().setQuantite_huile(getMoteur().getQuantite_huile()-1);
			return "voiture démarée\n";
		}else {
			String[] str=getMoteur().lancer();
			for(int i=0;i<str.length;i++) {
				System.out.println(str[i]);
			}
			System.out.println("Etat d'huile: "+getMoteur().getQuantite_huile()+"\n");
			getMoteur().setQuantite_huile(getMoteur().getQuantite_huile()-1);
			return "voiture démarée\n";
		}
	}*/
	public String[] demarer() {
		if(getMoteur().getQuantite_huile()==0) {
			getMoteur().setQuantite_huile(5);
			//throw new HuileInsuffisasntException();
		}
		getMoteur().setQuantite_huile(getMoteur().getQuantite_huile()-1);
		return getMoteur().lancer();
	}
	
	/**
	 * methode ouvrir le capot qui returne l'etat du moteur de la voiture
	 * @return
	 */
	public Moteur ouvrir_capot() {
		return getMoteur();
	}

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public boolean getIsValable() {
		return isValable;
	}
	public void setValable(boolean isValable) {
		this.isValable = isValable;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public double getNumero_serie() {
		return numero_serie;
	}
	public void setNumero_serie(double numero_serie) {
		this.numero_serie = numero_serie;
	}
}
