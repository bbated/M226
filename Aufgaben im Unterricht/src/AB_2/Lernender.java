package AB_2;

public class Lernender extends Person{
	int lehrjahr;
	
	public Lernender(String Name, String Vorname, int PersonalNummer, int Lehrjahr ) {
		super(Name, Vorname, PersonalNummer);
		// TODO Auto-generated constructor stub
		this.lehrjahr = Lehrjahr;
	}
	
	public void print() {
		super.print();
		System.out.println("Lehrjahr: " + lehrjahr);
	}

	@Override
	public int berechneFerien(int alter) {
		// TODO Auto-generated method stub
		return 5;
	}
}
