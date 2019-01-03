import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Field {

	private ArrayList<Bomb> bomb = new ArrayList<>() ;
	private ArrayList<Cell> cell = new ArrayList<>();
	
	private String[][] display;
	
	private int stillHiden;
	
	Settings set = new Settings();
	Userinput inp;
	Validator val = new Validator();
	
	private Random random = new Random();
	
	private int x = 100;
	private int y = 100; 
	
	public Field(Userinput input) {
		display = new String[set.getFieldLenght()][set.getFieldWidth()];
		this.stillHiden = set.getCellAmount();
		this.inp = input;
		
	}
	
	public void start() throws InterruptedException {
		this.initialize();
		while(val.isNBomb(x, y, bomb)) {
			if (!val.isNBomb(x, y, bomb)) {
				break;
			}
			this.x = 100;
			this.y = 100;
			if(val.isNInt(x, y, set.getFieldLenght(), set.getFieldWidth())) {
				this.x = inp.setX();
				this.y = inp.setY();
				if (val.isNRevealed(x, y, cell)) {
					for (Cell c : cell) {
						if (c.getX() == x && c.getY() == y) {
							c.setHide(false);
							if(val.isNBomb(c.getX(), c.getY(), bomb)){
								display[y][x] = String.valueOf(c.getValue());
								this.stillHiden--; 
							}
							else {
								c.setHide(false);
								display[y][x] = "B";
								break;
							}
							break;
						}
					}
				}
			}
			
			this.draw();
			if (stillHiden == 0) {
				break;
			}
			
		}
		if (stillHiden != 0) {
			this.revealBomb();
			set.lostEnd();
		}
		else {
			set.wonEnd();
		}
		
		
		
	}
	
	private void initialize() throws InterruptedException {
		this.x = 100;
		this.y = 100;
			set.Intro();
		
		//Alle Felder fühlen
		for (int i = 0; i < set.getFieldLenght(); i++) {
			for (int j = 0; j < set.getFieldWidth(); j++) {
				display[i][j] = "?"; 
				Cell c = new Cell(i,j);
				cell.add(c);
			}
		}
		
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println("Feld wurde erstellt");
		System.out.println("");
		
		//Alle Bomben setzen
		int bX = 0;
		int bY = 0;
		for (int i = 0; i < set.getBombAmount(); i++) {
			bX = random.nextInt(set.getFieldWidth() - 1);
			bY = random.nextInt(set.getFieldLenght() - 1);
			Bomb b = new Bomb(bX,bY);
			bomb.add(b);
			for (Cell c : cell) {
					if (c.getX() == bX + 1  && c.getY() == bY) {
						c.setValue(c.getValue() + 1);
					}
					if (c.getX() == bX + 1  && c.getY() == bY + 1) {
						c.setValue(c.getValue() + 1);
					}
					if (c.getX() == bX  && c.getY() == bY + 1) {
						c.setValue(c.getValue() + 1);
					}
					if (c.getX() == bX + 1  && c.getY() == bY - 1) {
						c.setValue(c.getValue() + 1);
					}
					if (c.getX() == bX  && c.getY() == bY - 1) {
						c.setValue(c.getValue() + 1);
					}
					if (c.getX() == bX - 1  && c.getY() == bY - 1) {
						c.setValue(c.getValue() + 1);
					}
					if (c.getX() == bX - 1  && c.getY() == bY) {
						c.setValue(c.getValue() + 1);
					}
					if (c.getX() == bX - 1  && c.getY() == bY + 1) {
						c.setValue(c.getValue() + 1);
					} 
					
			}
			
		}
		
		TimeUnit.MILLISECONDS.sleep(3000);
		System.out.println("Minen wurden gelegt");
		System.out.println("");
		TimeUnit.MILLISECONDS.sleep(1000);
		
		this.draw();
		
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println("");
		System.out.println("Das Spiel begint \n");
	}
	
	private void draw() {
		System.out.println("");
		int x = 0;
		boolean header = true;
		for (int i = 0; i < set.getFieldLenght(); i++) {
			for (int j = 0; j < set.getFieldWidth(); j++) {
				if (header) {
					System.out.print(" ");
					for (int y = 0; y < set.getFieldWidth(); y++) {
						System.out.print(" " + y);
					}
					System.out.println("");
					System.out.print(x + " " + display[0][0]);
					header = false;
					
				}
				
				else {					
					System.out.print(" " + display[i][j]);
				}

			}
			System.out.print("\n");
			
			if(i != set.getFieldLenght()-1){
				x++;
				System.out.print(x);
			}

		}
		
		System.out.println("");
	}
	
	private void revealBomb() {
		for (Bomb b : bomb) {
			display[b.getY()][b.getX()] = "B";
		}
		this.draw();
	}
	
}
