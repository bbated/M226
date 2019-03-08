package AB_2;

class Fachangestellter extends Person {
	
	Chef vorgesetzter;
	
	public Fachangestellter(String Name, String Vorname, int PersonalNummer, Chef Vorgesetzter) {
		super(Name, Vorname, PersonalNummer);
		// TODO Auto-generated constructor stub
		this.vorgesetzter = Vorgesetzter;
	}
	
	public void print() {
		super.print();
		System.out.println("Vorgesezter: " + vorgesetzter.vorname + " " + vorgesetzter.name);
	}

	@Override
	public int berechneFerien(int alter) {
		// TODO Auto-generated method stub
		if(alter >= 50) {
			
			if(alter >= 60) {
				
				return 6;
			}
			return 5;
		}
		
		
		return 4;
	}
}
