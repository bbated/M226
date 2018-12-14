
public class Field {

	private Cell cellList[][];
	private Bomb bombList[];

	public Field() {
		Settings set = new Settings();
		cellList = new Cell[set.getFieldWidth()][set.getFieldLenght()];
		bombList = new Bomb[set.getBombAmount()];
		
	}
}
