package Grafikeditor2;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Papier extends JPanel implements MouseListener, MouseMotionListener, KeyListener {

	private int x,y;
	private Zeichnung zeichnung = new Zeichnung();
	Figur f = null;
	private char mode = 'r';
	private char fill = 'e';
	private char color = 'n';
	
		
	public Papier() {
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		this.setFocusable(true);
	}
	
	public void paintComponent(final Graphics g){
		super.paintComponent(g);
		if (zeichnung != null) zeichnung.draw(g);
	}
	
	public void setZeichnung(final Zeichnung zeichnung){
		this.zeichnung = zeichnung;
	}
	
	public void keyPressed(KeyEvent e) {
		Pattern pattern = Pattern.compile("^[rlot]$");
		Matcher matcher = pattern.matcher(e.getKeyChar() + "");
		if(matcher.matches()) {
		     mode = e.getKeyChar();
		}
		
		Pattern pattern2 = Pattern.compile("^[ef]$");
		Matcher matcher2 = pattern2.matcher(e.getKeyChar() + "");
		if(matcher2.matches()) {
		     fill = e.getKeyChar();
		}
		
		Pattern pattern3 = Pattern.compile("^[yn]$");
		Matcher matcher3 = pattern3.matcher(e.getKeyChar() + "");
		if(matcher3.matches()) {
		     color = e.getKeyChar();
		}
	}

	public void mousePressed(MouseEvent e) {
		this.x = e.getX();
		this.y = e.getY();
	}
	
	public void mouseReleased(MouseEvent e) {
		try {
			this.f = createFigur(e);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	private Figur createFigur(MouseEvent e) throws Exception {
				int width, height;
				if (e.getX() > this.x) {
					width = e.getX() - this.x;
				} else {
					width = this.x - e.getX();
					this.x -= width;
				}
				if (e.getY() > this.y) {
					height = e.getY() - this.y;
				} else {
					height = this.y - e.getY();
					this.y -= height;
				}
				switch (mode) {
				case 'r':
					f = new Rechteck(x, y, width, height, fill, color);
					break;
				case 'l': 
					f = new Line(x,y,e.getX(), e.getY());
					f.move(10, 10);
					break;
				case 'o':
					f = new Oval(x, y, width, height, fill);
					break;
				case 't':
					f = new Text(e.getX(), e.getY(), "Text");
					break;
				default:
					throw new Exception("Unknown Mode");
				}
				
				zeichnung.addFigur(f);
				repaint();
				return f;
			}
	public void mouseDragged(MouseEvent e) {
		
	}
	
	public void mouseClicked(MouseEvent arg0) {}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}