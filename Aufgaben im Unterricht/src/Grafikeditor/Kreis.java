package Grafikeditor;

public class Kreis extends Figur {
	private int radius;
	
	public Kreis(int Radius) {
		
		this.radius = Radius;
		
	}
	String text = "";
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
