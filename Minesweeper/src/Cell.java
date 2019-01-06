
public class Cell {
	
	private boolean hide = true;
	
	private int value = 0;
	private int x;
	private int y;
	
	public Cell(int x, int y){
		this.x = x;
		this.y = y;
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
