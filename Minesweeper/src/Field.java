import java.util.ArrayList;

public class Field {

	private ArrayList<Bomb> bomb = new ArrayList<>() ;
	private ArrayList<Cell> display = new ArrayList<>();
	Settings set = new Settings();
	
	public void start() {
		
		//Alle Felder fühlen
		for (int i = 0; i < set.getFieldWidth(); i++) {
			for (int j = 0; j < set.getFieldLenght(); j++) {
				Cell c = new Cell(i,j);
				display.add(c);
			}
		}
		
		//Alle Bomben setzen
		
	}
}
