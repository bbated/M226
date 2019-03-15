package Book;

public class Bibliothek {

	private static Medium[] katalog;
	
	public static void main(String[] args) {
		katalog = new Medium[3];
		katalog[0] = new Buch();
		katalog[1] = new CD();
		katalog[2] = new DVD();
		
		for (Medium m : katalog) {
			m.showSample(m);
		}
	}
}
	

