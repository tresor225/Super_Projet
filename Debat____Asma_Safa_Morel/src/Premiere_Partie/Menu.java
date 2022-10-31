package Premiere_Partie;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	
	public Menu() {
		this.sc=new Scanner(System.in);
		
	}
	
	
	public int premierMenu() {
		
		    int nbrArg;
			
			System.out.println("Veuillez entrer le nombre d'argument neccessaire!");
			nbrArg=sc.nextInt();
		    return nbrArg;
		
	}
	
	
	
	
	public void deuxiemeMenu(int nbr) {
		
			Debat debat=new Debat(nbr);
			
			int choix=0;
			String ArgA=null;
			String ArgB=null;
			
			//boucle do
			do {
				
				System.out.println("1) Ajouter une Contradiction! ");
				System.out.println("2) Fin.");
				choix=sc.nextInt();
				
			}while(choix <1 || choix> 2);
			 
			
			//
			if(choix==1) {
				
				System.out.println("Argument 1: ");
				ArgA=sc.next();
				System.out.println("Argument 2: ");
				ArgB=sc.next();
				
				debat.ajouterContradiction(ArgA, ArgB);
				
				
				
			}
			
			debat.afficherRelation();
			
	}
}
