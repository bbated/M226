package Arbeitsblatt_6;

public class Kunde {
	
	private String Vorname;
	private String Nachname;
	
	private int Kontonummer;

	
	public Kunde(String vorname, String nachname, int kontonummer) {
		Vorname = vorname;
		Nachname = nachname;
		Kontonummer = kontonummer;
		
	}
	
	public String getName() {
		return Nachname;
	}
}
