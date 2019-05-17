package Grafikeditor2;
import java.awt.Color;
import java.awt.Graphics;


public class Rechteck extends Figur {
	private int width, height;
	private char fill;
	private char color;
	public Rechteck(int x, int y, int width, int height, char fill, char color) {
		super(x, y);
		this.width = width;
		this.height = height;
		this.fill = fill;
		this.color = color;
	}
	
	@Override
	public void draw(Graphics g) {
		if(color == 'y') {
			g.setColor(new Color((int)(Math.random() * 0x1000000)));
			drawing(g);
		}
		
		else {
			g.setColor(Color.black);
			drawing(g);
		}

		
		
	
	}
	
	private void drawing(Graphics g) {
		
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