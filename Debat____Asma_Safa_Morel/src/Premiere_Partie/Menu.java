package Premiere_Partie;

import java.util.Scanner;

public class Menu {

	private Scanner sc;
	private Debat debat;

	public Menu(Debat debat) {
		this.sc = new Scanner(System.in);
		this.debat=debat;
	}

	public int premierMenu() {

		int nbrArg;

		System.out.println("Veuillez entrer le nombre d'argument neccessaire!");
		nbrArg = sc.nextInt();
		return nbrArg;

	}

	public void deuxiemeMenu(int nbr) {

		Debat debat = new Debat(nbr);

		int choix = 0;
		String ArgA = null;
		String ArgB = null;

		// boucle do
		do {

			System.out.println("1) Ajouter une Contradiction! ");
			System.out.println("2) Fin.");
			choix = sc.nextInt();

		} while (choix < 1 || choix > 2);

		//
		if (choix == 1) {

			System.out.println("Argument 1: ");
			ArgA = sc.next();
			System.out.println("Argument 2: ");
			ArgB = sc.next();

			debat.ajouterContradiction(ArgA, ArgB);
		} else if (choix == 2) {

			do {

				System.out.println("1) Ajouter un argument ");
				System.out.println("2) retirer un argument");
				System.out.println("3) verifier la solution ");
				System.out.println("4) Fin.");
				choix=sc.nextInt();

			} while (choix < 1 || choix > 4);
			switch(choix) {
			case 1: 
				System.out.print("entrez l'argument a ajouter");
				String a= sc.nextLine();
				debat.ajouterArgument(a);
				break;
			case 2:
				System.out.print("entrez l'argument a supprimer");
				String b= sc.nextLine();
				debat.retirerArgument(b);
				break;
			case 3:
				debat.verifierSolution();
				break;
			case 4:
				break;
			}
			
		}
		

		debat.afficherRelation();

	}
}
