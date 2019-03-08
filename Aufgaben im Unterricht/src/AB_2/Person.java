package AB_2;

abstract class Person {
	String name;
	String vorname;
	int personalNummer;
	
	public Person(String Name, String Vorname, int PersonalNummer) {
		this.name = Name;
		this.vorname = Vorname;
		this.personalNummer = PersonalNummer;
		
	}
	
	public void print() {
		System.out.println("Name: "+this.vorname + " " + this.name);
		System.out.println("Personalnummer: " + this.personalNummer);
	}

	public abstract int berechneFerien(int alter);
}
