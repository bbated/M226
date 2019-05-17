package Grafikeditor2;

import java.awt.Graphics;

public class Oval extends Figur {

	private int width, height;
	private char fill;
	
	public Oval(int x, int y, int width, int height, char fill) {
		super(x, y);
		this.width = width;
		this.height = height;
		this.fill = fill;
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub	
		if(fill == 'e') {
			g.drawOval(x, y, width, height);
		}
		
		else {
			g.fillOval(x, y, width, height);
		}

	}

	@Override
	public double area() {
		return (this.width / 2) * (this.height / 2) * Math.PI;
	}

}
