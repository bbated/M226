package Grafikeditor2;

import java.awt.Graphics;

public class Text extends Figur{

	private String text;
	
	
	public Text(int x, int y, String text) {
		super(x, y);
		this.text = text;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move(int dx, int dy) {
		super.move(dx, dy);
		this.x += dx;
		this.y += dy;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawString(text, x, y);
	}
	@Override
	public double area() {
		return 0;
	}
}
