import java.util.concurrent.TimeUnit;

public class Settings {
	
	private int fieldY;
	private int fieldX;
	private int bombAmount;
	private int cellAmount;
	
	public int getFieldY() {
		return fieldY;
	}

	public void setFieldY(int fieldY) {
		this.fieldY = fieldY;
	}

	public int getFieldX() {
		return fieldX;
	}

	public void setFieldX(int fieldX) {
		this.fieldX = fieldX;
	}

	public int getBombAmount() {
		return bombAmount;
	}

	public void setBombAmount(int bombAmount) {
		this.bombAmount = bombAmount;
	}


	
	public int getCellAmount() {
		return cellAmount;
	}

	public Settings(){ //Set default Settings
		changeToDefault();
		this.cellAmount = (this.fieldY * this.fieldX) - this.bombAmount;
	}
	
	void changeToDefault() {
		this.fieldY = 8;
		this.fieldX = 10;
		this.bombAmount = 10;
	}
	
	void changeToMedium() {
		this.fieldY = 14;
		this.fieldX = 18;
		this.bombAmount = 40;
	}
	
	void changeToHard(){
		this.fieldY = 20;
		this.fieldX = 24;
		this.bombAmount = 99;
	}
	
	public void Intro() throws InterruptedException{
		System.out.print("Willkommen");
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.print(" zu Minesweeper"); 
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println(" von Benjamin und Dean");
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println("");
		System.out.println("Wir Bereiten alles für Sie vor");
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println("");
		
		for (int i = 0; i < 25; i++) {
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(100);
		}
		System.out.println(" 100%");
		System.out.println("");
	}
	
	public void lostEnd() {
		System.out.println("Leider war dieses Feld eine Bombe");
		System.out.println("Danke das Sie unser Minesweeper gespielt haben");
	}
	
	public void wonEnd() {
		System.out.println("Gratulation Sie haben Gewonnen danke fürs Mitspielen");
		
	}
	
	
}
