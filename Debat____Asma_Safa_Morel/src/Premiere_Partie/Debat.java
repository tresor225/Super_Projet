package Premiere_Partie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;



public class Debat {

	
	
	// a la creation d'un debat l'ajout d'argument aucun n'argument n'est contredit
	private ArrayList<Argument>args;
	private int nbrArg;
	//la clé est l'argument et sa valeur l'argument qu'il le contredit
	private HashMap<Argument, Argument>relation;
	
	
	
	public Debat(int nbrArg) {
		this.args=new ArrayList<>();
		String id="";
		
		for(int i=0;i<nbrArg;i++) {
			id="A"+i;
			Argument ar= new Argument(id);
			args.add(ar);
			
		}
		
		relation= new HashMap();
	}
	
	
	
	
	public void afficherArgument() {
		
		for(Argument ar:args) {
			
			System.out.println(""+ar.getId());
		}
	}
	
	
	
	
	
	
	
	//retour l'argument qui a pour id entré en parametre
	public Argument id_to_arg(String arg1) {
		
		Argument arg=null;
		for(int i=0;i<args.size();i++) {
			if(args.get(i).getId().equals(arg1)) {
				arg=args.get(i);
			}
		}
		
		return arg;
		
	}
	
	
	
	
	
	
	
	
	//arg1 contredit par arg2
	public void ajouterContradiction(String arg1,String arg2) {
		
		Argument argA=id_to_arg( arg1);
		Argument argB=id_to_arg( arg2);
			
	 
		if(this.args.contains(argA)&& this.args.contains(argB)) {
			this.relation.put(argA, argB);
			
		}
		else {
			System.out.println("Un des argument n'existe pas");
		}
	}
	
	
	
	
	//affiche les relations
	
	public void afficherRelation() {
		
		for(Entry<Argument, Argument>arg:relation.entrySet()) {
			
			System.out.println(""+arg.getKey().getId()+" Contredit "+arg.getValue().getId());
		}
	}
	
	
	
	
	
	// renvoie true si une relation existe entre deux argument
	
	public boolean verifieRelation(String arg1,String arg2) {
		
		boolean exist=false;
		 
		for(Entry<Argument,Argument>arg:relation.entrySet()) {
			  
			
			if(arg.getKey().equals(id_to_arg(arg1)) && arg.getValue().equals(id_to_arg(arg2))){
				
				exist=true;
			}
		}
		
		 return exist;
	}
	
	
	
}
