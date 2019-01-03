import java.util.concurrent.TimeUnit;

public class Settings {
	
	private int fieldLenght;
	private int fieldWidth;
	private int bombAmount;
	private int cellAmount;
	
	public int getFieldLenght() {
		return fieldLenght;
	}

	public void setFieldLenght(int fieldLenght) {
		this.fieldLenght = fieldLenght;
	}

	public int getFieldWidth() {
		return fieldWidth;
	}

	public void setFieldWidth(int fieldWidth) {
		this.fieldWidth = fieldWidth;
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
		this.cellAmount = (this.fieldLenght * this.fieldWidth) - this.bombAmount;
	}
	
	void changeToDefault() {
		this.fieldLenght = 8;
		this.fieldWidth = 10;
		this.bombAmount = 10;
	}
	
	void changeToMedium() {
		this.fieldLenght = 14;
		this.fieldWidth = 18;
		this.bombAmount = 40;
	}
	
	void changeToHard(){
		this.fieldLenght = 20;
		this.fieldWidth = 24;
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
