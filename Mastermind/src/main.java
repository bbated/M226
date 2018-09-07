import java.util.Scanner;

public class main {
	
	private static Mastermind mastermind = new Mastermind();
	
	public static void main(String[] args) {
		
		String[] colorCode = mastermind.getColorCode();
		
		String Code = "";
		String versuch = "";
		Scanner input = new Scanner(System.in);

		int amount = 0;
		
		while (amount < colorCode.length) {
			Code += colorCode[amount];
			amount++;
		}
		mastermind.start();
		versuch = input.nextLine();
		/*System.out.println(versuch);
		System.out.println(Code);*/
		

		
	}

}
