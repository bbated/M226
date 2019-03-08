package AB_2;

public class Personen {
	public static void main (String args[]) {
		
		Person[] angestellte = new Person[4];
		angestellte[0] = new Chef("Sattler", "Beatrice", 1232 ,"Verkauf");
		angestellte[1] = new Fachangestellter("Klein", "Thomas", 98798 , (Chef)angestellte[0]);
		angestellte[2] = new Lernender("Hodler", "Martin", 79879 , 1);
		angestellte[3] = new Fachangestellter("Nydegger", "Marc", 923 , (Chef)angestellte[0]);
		
		
		
		for (int i = 0; i <= angestellte.length-1; i++) {
			
			angestellte[i].print();
			System.out.println("Der Ferieanspruch beträgt: " + angestellte[i].berechneFerien(55) + " Wochen");
			System.out.println();
			
		}
	}
	
}
