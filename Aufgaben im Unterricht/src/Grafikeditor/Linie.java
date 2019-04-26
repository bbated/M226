package Grafikeditor;

public class Linie extends Figur {
	
	private int endX;
	private int endY;
	
	public Linie(int EndX, int EndY) {
		
		this.endX = EndX;
		this.endY = EndY;
	}

	public int getEndX() {
		return endX;
	}

	public void setEndX(int endX) {
		this.endX = endX;
	}

	public int getEndY() {
		return endY;
	}

	public void setEndY(int endY) {
		this.endY = endY;
	}
	
}
