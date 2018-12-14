package Arbeitsblatt_6;

public class Konto {
	
	private String inhaber;
	
	private double Saldo;
	private double Zinssatz = 0.01;
	
	public Konto(String name) {
		inhaber = name;
		System.out.println("Der Kunde " + name + " hat ein Konto.");
	}
	
	public void setZinssatz(double neuZins) {
		this.Zinssatz = neuZins;
	}
		
	public void einzahlen(double amount) {
		Saldo += amount;
	}
	
	public void verzinsen(int Tage) {
		
		double Verzinsung;
		
		if (Saldo >= 50000) {
			
			if (Saldo >= 500000) {
				
				Verzinsung = Saldo;
				Saldo = Verzinsung;
			}
			else {
				Verzinsung = Saldo * (Zinssatz/2) * Tage/365;
				Saldo += Verzinsung;
			}
		}
		
		else {
			Verzinsung = Saldo * Zinssatz * Tage/365;
			Saldo += Verzinsung;
		}
		

	}
	
	public void getSaldo() {
		System.out.println("Das Saldo des Kontos ist " + Saldo);
	}
	
	public double getSaldoNum() {
		return this.Saldo;
	}

}
