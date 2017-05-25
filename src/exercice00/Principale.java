package exercice00;

public class Principale {
	
	public static void uneAutreMethode(){
		System.out.println("Comment va le monde");
	}
	
	
	public static void main(String[] args){
		System.out.println("Bonjour le monde");
		int var = 4;
		uneAutreMethode();
		
		uneAutreMethode();
		System.out.println(var);
		
	}
		
	
}
