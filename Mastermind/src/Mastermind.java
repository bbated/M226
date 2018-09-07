import java.util.Random;

public class Mastermind {
	
	public Mastermind() {
		setCode();
	}
	
	private String[] colors = new String[] {"r","b","g","y","w","s"};
	private String[] colorCode = new String[4];
	
	public String[] getColorCode() {
		return colorCode;
	}

	public void setColorCode(String[] colorCode) {
		this.colorCode = colorCode;
	}

	private Random random = new Random();
	
	private void setCode(){
		int colorAmount = 0;
		while (colorAmount < colorCode.length) {
			int rnd = random.nextInt(colors.length); 
			colorCode[colorAmount] = colors[rnd];
			colorAmount++;
		}
	}
	
	public void start() {
		System.out.println("Geben Sie einen Versuchscode mit vier Buchstaben aus der Menge {r,g,b,y,s,w} ein:");
	}
	
	public void ending(int versuche) {
		System.out.println("Spiel beendet. Geheimcode war " + versuche + ". Anzahl Versuche");
	}
	

	

}
