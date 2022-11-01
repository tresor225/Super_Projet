package Premiere_Partie;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	
	public Menu() {
		this.sc=new Scanner(System.in);
		
	}
	
	
	public int premierMenu() {
		
		    int nbrArg;
			
			System.out.println("Veuillez entrer le nombre d'argument neccessaire: ");
			nbrArg=sc.nextInt();
		    return nbrArg;
		
	}
	
	
	
	
	
	
	public void deuxiemeMenu(int nbr) {
		
			Debat debat=new Debat(nbr);
			
			int choix=0;
			String ArgA=null;
			String ArgB=null;
			
				 
					do {
						
						System.out.println("1) Ajouter une Contradiction: ");
						System.out.println("2) Fin.");
						choix=sc.nextInt(); 
						
						       if(choix==1) {
									System.out.println("Argument 1: ");
									ArgA=sc.next();
									System.out.println("Argument 2: ");
									ArgB=sc.next();
									debat.ajouterContradiction(ArgA, ArgB);
								}
						
						//debat.afficherRelation();
						//debat.solution();
						       
						       
						       if(choix==2) {
						    	   
						    	   troisiemeMenu(debat);
						       }
						
					}while(choix <=1 || choix> 2);
					 
				 
	}
	
	
	
	
	
	
	
	 
	
	
	
	public void troisiemeMenu(Debat debat) {
		
		int choix=0;
		ArrayList<ArrayList<String>>arr;
		arr=debat.solution();
		System.out.println(arr);
		
		do {
				System.out.println("1) Ajouter un argument");
				System.out.println("2) Retirer un argument");
				System.out.println("3) Verifier la solution");
				choix=sc.nextInt();
				
		}while(choix<1 || choix>3);
		
			
	}
}
