package Arbeitsblatt_6;

public class Testkonto {

	public static void main(String[] args) {
		
		int nummer = 0;
		
		Kunde kunde1 = new Kunde("Max", "Meier", nummer);
		
		nummer++;
		
		Kunde kunde2 = new Kunde("Ma", "Mayer", nummer);
		
		Konto konto1 = new Konto(kunde1.getName());
		konto1.einzahlen(100);
		konto1.verzinsen(365);
		konto1.getSaldo();
		
		Konto konto2 = new Konto(kunde2.getName());
		konto2.einzahlen(720.50);
		konto2.verzinsen(1440);
		konto2.getSaldo();
		konto2.einzahlen(150);
		konto2.getSaldo();
		

	}

}
