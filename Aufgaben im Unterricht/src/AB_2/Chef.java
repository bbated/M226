package AB_2;

class Chef extends Person {
	String abteilung;
	
	public Chef(String Name, String Vorname, int PersonalNummer, String Abteilung) {
		super(Name, Vorname, PersonalNummer);
		this.abteilung = Abteilung;
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		super.print();
		System.out.println( "Abteilung: " + abteilung);
	}

	@Override
	public int berechneFerien(int alter) {
		// TODO Auto-generated method stub
		if(alter >= 45) {
			if(alter >= 55) {
				return 6;
			}
			return 5;
		}
		
		return 4;
	}
}
