import java.util.Scanner;

/**
 * Die Klasse Userinput nimmt die Eingabe des Benutzers auf. 
 *
 * @author Dean Bates & Benjamin Jiang
 * @version 1.0
 */

public class Userinput {
	
	Scanner input = new Scanner(System.in);
	
	/**
	 * Ist der Text der erscheint wenn man die X Koordinate eingibt
	 */
	private String requestTextX = "Bitte geben sie die X Koordinate ein: ";
	
	/**
	 * Ist der Text der erscheint wenn man die Y Koordinate eingibt
	 */
	private String requestTextY = "Bitte geben sie die Y Koordinate ein: ";
	
	public int setX() {
		System.out.print(requestTextX);
		return input.nextInt();
	}
	
	public int setY() {
		System.out.print(requestTextY);
		return input.nextInt();
	}
}
