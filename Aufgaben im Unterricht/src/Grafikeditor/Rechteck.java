package Grafikeditor;

public class Rechteck extends Figur {
	private int breite;
	private int hoehe;
	
	public Rechteck (int Breite, int Hoehe) {
		
		this.breite = Breite;
		this.hoehe = Hoehe;
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public int getHoehe() {
		return hoehe;
	}

	public void setHoehe(int höhe) {
		this.hoehe = höhe;
	}
}
