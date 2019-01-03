import java.util.Scanner;

public class Userinput {
	Scanner input = new Scanner(System.in);
	
	private String requestTextX = "Bitte geben sie die X Koordinate ein: ";
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
