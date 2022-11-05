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
 * 		-marque : String
 * 		-numero_serie:double
 * 		-moteur:Moteur
 * 		-isValable:boolean
 * 		+demarer():String[]
 * 		+ouvrir_capot():Moteur
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
 * Moteur "1" --o Voiture 
 * Cylindre "2..12" --* Moteur
 * Agence o-- "1..*" Voiture :contenir
 * Client "1" -- "1" Agence :acceuillir
 * Client "0..1" -- "0..1" Voiture : louer
 * View ..> Manager
 * Manager *-- Agence
 * Manager *-- Voiture
 * Manager *-- Client
 * 
 * 
 

	@enduml

 */




package org.formation.erekysy.agencelocation;

import java.util.ArrayList;
import java.util.HashMap;

import org.formation.erekysy.agencelocation.model.Cylindre;
import org.formation.erekysy.agencelocation.model.Voiture;

public class DiagrammeClassePlantUML {

	public DiagrammeClassePlantUML() {
		// TODO Auto-generated constructor stub
	}

}
