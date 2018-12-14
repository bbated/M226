
public class Settings {
	
	private int fieldLenght;
	private int fieldWidth;
	private int bombAmount;
	
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


	
	public Settings(){ //Set default Settings
		changeToDefault();
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
	
	
}
