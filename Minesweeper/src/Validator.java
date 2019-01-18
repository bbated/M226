import java.util.ArrayList;

/**
 * Die Klasse Validator zerlegt die Eingabe
 * und überprüft ob es eine Zahl, eine Bombe oder aufgedekt ist. 
 *
 * @author Dean Bates & Benjamin Jiang
 * @version 1.0
 */

public class Validator {

	/**
	 * Gibt zurück, ob die Eingabe eine valide Zahl ist.
	 * @param x X Koordinate
	 * @param y Y Koordinate
	 * @return Korrektheit der Eingabe.
	 */
	public boolean isInt(int x, int y, int width, int lenght) { 
		if(x <= (width - 1)  && y <= (lenght - 1)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/**
	 * Gibt zurück, ob die Eingabe eine Bombe ist.
	 * @return Korrektheit der Eingabe.
	 */
	public boolean isBomb(int x, int y, ArrayList<Bomb> listBomb) {
		for (Bomb b : listBomb) {
			if (b.getX() == x && b.getY() == y) {
				return true;
			}
		}
		return false;
		
	}
	
	/**
	 * Gibt zurück, ob die Eingabe noch nicht aufgedeckt ist.
	 * @return Korrektheit der Eingabe.
	 */
	public boolean isNRevealed(int x, int y, ArrayList<Cell> cellList){
		for (Cell c : cellList) {
			if (c.getX() == x && c.getY() == y && c.isHide()) {
				return true;
			}
		}
		return false;
	}
}
