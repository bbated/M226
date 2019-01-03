import java.util.ArrayList;

public class Validator {

	public boolean isNInt(int x, int y, int lenght, int width) {
		if(x <= (width - 1)  && y <= (lenght - 1)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean isNBomb(int x, int y, ArrayList<Bomb> listBomb) {
		for (Bomb b : listBomb) {
			if (b.getX() == x && b.getY() == y) {
				return false;
			}
			else {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean isNRevealed(int x, int y, ArrayList<Cell> cellList){
		for (Cell c : cellList) {
			if (c.getX() == x && c.getY() == y && c.isHide()) {
				return true;
			}
		}
		return false;
	}
}
