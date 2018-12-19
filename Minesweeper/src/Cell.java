
public class Cell {
	
	private boolean hide = true;
	
	private int value = 0;
	private int x;
	private int y;
	
	public Cell(int width, int lenght){
		this.x = width;
		this.y = lenght;
	}
	
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public boolean isHide() {
		return hide;
	}

	public void setHide(boolean hide) {
		this.hide = hide;
	}
}
