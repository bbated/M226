import java.util.Random;
import java.util.Scanner;

public class Mastermind {
	
	public Mastermind() {
		setCode();
	}
	
	private Settings set = new Settings();
	
	private Scanner input = new Scanner(System.in);
	
	private String[] colors = set.getColors();
	private String[] colorCode = new String[4];
	private String[] versuch = new String[colorCode.length];
	
	private boolean win = false;
	
	private int[] check = new int[set.getCodeLenth()];
	
	private int anzahlVersuche = set.getAnzahlVersuche();
	
	private Random random = new Random();
	
	private void setCode(){
		int colorAmount = 0;
		while (colorAmount < colorCode.length) {
			int rnd = random.nextInt(colors.length); 
			colorCode[colorAmount] = colors[rnd];
			colorAmount++;
		}
	}
	
	private String getCode() {
		String code = "";
		for (String i : colorCode) {
			code += i + " ";
		}
		
		return code;
	}
	
	private void setCheck() {
		for (int i = 0; i < check.length; i++) {
			check[i] = 0;
		}
	}
	
	private void fillCheck(int correct) {
		
		if (correct == 4) {
			win = true;
		}
		
		while (correct != 0) {
			
			int rnd = random.nextInt(check.length);
			if (check[rnd] == 0) {
				
				check[rnd] = 1;
				correct--;
			}
		}
	}
	
	private String getCheck() {
		
		String antwort = ""; 
		
		for (int i = 0; i < check.length; i++) {
			antwort += check[i] + " ";
		}
		return antwort;
	}
	
	private void compCodes() {
		int correct = 0;
		
		for (int i = 0; i < versuch.length; i++) {
			if (colorCode[i].equals(versuch[i])) {
				correct++;
			}
		}	
		
		fillCheck(correct);
		
	}
	
	public void start() {
		
		while(anzahlVersuche != 0) { 
			
			setCheck();
			System.out.println("Geben Sie einen Versuchscode mit vier Buchstaben aus der Menge " + set.getFarben() + "ein:");

			for (int i = 0; i < colorCode.length; i++) {
				versuch[i] = input.next();
			}
			
			compCodes();
			
			if (win) {
				break;
			}
			else {
				System.out.println(getCheck() + "\n");
				anzahlVersuche--;
			}
		}
		if(win) {
			gewonnen(anzahlVersuche);
		}
		else {
			verloren();
		}
	}
	
	public void gewonnen(int versuche) {
		System.out.println("Sie haben Gewonnen! Geheimcode war " + getCode() + "\n" + versuche + " übrige Versuche");
	}
	
	private void verloren() {
		System.out.println("Leider haben Sie Verloren\nDer Code war: " + getCode());
	}
	

	

}
