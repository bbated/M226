package AB_2;

class Fachangestellter extends Person {
	
	Chef vorgesetzter;
	
	public Fachangestellter(String Name, String Vorname, int PersonalNummer, Chef Vorgesetzter) {
		super(Name, Vorname, PersonalNummer);
		// TODO Auto-generated constructor stub
		this.vorgesetzter = Vorgesetzter;
	}
}
