package Book;

public class Buch extends Medium {
	String sample = "Buch";

	@Override
	public void showSample(Medium m) {
		System.out.println(((Buch) m).sample);
		
		}
	}