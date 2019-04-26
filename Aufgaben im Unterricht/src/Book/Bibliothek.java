package Book;

public class Bibliothek {

	
	public static void main(String[] args) {
		
		
		Katalog test = new Katalog();
		test.addMedium(new Buch());
		test.addMedium(new CD());
		test.addMedium(new DVD());
		
		test.showMedium();
	}
}
	

