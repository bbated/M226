package Grafikeditor2;
import java.awt.Color;
import java.awt.Graphics;


public class Rechteck extends Figur {
	private int width, height;
	private char fill;
	public Rechteck(int x, int y, int width, int height, char fill) {
		super(x, y);
		this.width = width;
		this.height = height;
		this.fill = fill;
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(new Color((int)(Math.random() * 0x1000000)));
		
		if(fill == 'e') {
			g.drawRect(x, y, width, height);
		}
		
		if(fill == 'f') {
			g.fillRect(x, y, width, height);
		}
	
	}

	@Override
	public double area() {
		return width * height;
	}
	
}