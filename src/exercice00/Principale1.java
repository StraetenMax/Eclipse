package exercice00;

public class Principale1 {
	public static void main(String[] args){
	
	int res=0;
	res = tirerLeNombre();
	
	if(res<3){
		res = tirerLeNombre();
	}	
	}

	private static int tirerLeNombre() {
		int res;
		res =(int)(Math.random()*6+1);
		System.out.println("Résultat du tirage "+res);
		return res;
	}
	
	}
