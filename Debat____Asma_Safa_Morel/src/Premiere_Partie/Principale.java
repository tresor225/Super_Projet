package Premiere_Partie;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//Menu menu= new Menu();
		
		//menu.premierMenu();
		
	//	menu.deuxiemeMenu(menu.premierMenu());
		
		Debat debat= new Debat(4) ;
		
		debat.afficherArgument();
		debat.ajouterContradiction("A1", "A2");
		debat.ajouterContradiction("A2", "A1");
		
		debat.ajouterContradiction("A2", "A3");
		debat.ajouterContradiction("A3", "A2");
		
		debat.ajouterContradiction("A3", "A4");
		debat.ajouterContradiction("A4", "A3");
		
		//System.out.println(debat.sontEnrelation("A4", "A2"));
		System.out.println(debat.solution());
		debat.ajouterArg("A1", debat.solution());
		
//A1,A3  A1,A4  A2,A4   */
		
	 
		
		 
		
		
	}

}
