/**
 * 
 * @startuml 
 * class  Client{ 
 * 		-age:int 
 * 		-nom:String
 * 		-alouer:boolean
 * 		+louer() : String[]
 * 		+rendre() : void 
 * 		+conduire() :String 
 * }
 * class Agence{
 * 		-nom :String
 * 		-voiture: ArrayList<Voiture>
 * 		-hm:HashMap<String,Voiture>
 * 		+acceuil(Client):String[]
 * 		+rendre(String):String
 * }
 * class Voiture{ 
 * 		
 * }
 * class Camion{ 
 * 		
 * }
 * class Vehicule{
 * 		-marque : String
 * 		-numero_serie:double
 * 		-moteur:Moteur
 * 		-isValable:boolean
 * 		+demarer():String[]
 * 		+ouvrir_capot():Moteur
 * 		+toString():String
 * 
 * }
 * class Cylindre{
 * 		+afficher_etat():String
 * }
 * class Moteur{
 * 		-cylindre: ArrayList<Cylindre>
 * 		{Static} quantite_huile:int
 * 		+lancer():String[]
 * }
 * class Manager{
 * 		+init():void
 * 		+louer():String[][]
 * 		+rendre():String[]
 * 		+ conduire():String[]
 * }
 * class View{
 * 		+louer():void
 * 		+rendre():void
 * 		+ conduire():void 
 * }
 * Vehicule <|-- Voiture
 * Vehicule <|-- Camion
 * Moteur "1" --o Vehicule 
 * Cylindre "2..12" --* Moteur
 * Agence o-- "1..*" Vehicule :contenir
 * Client "1" -- "1" Agence :acceuillir
 * Client "0..1" -- "0..1" Vehicule : louer
 * View ..> Manager
 * Manager *-- Agence
 * Manager *-- Voiture
 * Manager *-- Camion
 * Manager *-- Client
 * 
 * 
 
 
	@enduml

 */




package org.formation.erekysy.agencelocation;


public class DiagrammeClassePlantUML {

	public DiagrammeClassePlantUML() {
		// TODO Auto-generated constructor stub
	}

}
