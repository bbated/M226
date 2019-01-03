
public class main {
	
	private static Userinput inp = new Userinput();
	private static Field field = new Field(inp);
	
	public static void main(String[] args) {
		Field field = new Field(inp);
		
		boolean play = true;
		
		String answer;
		
		while (play){
			try {
				field.start();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
			System.out.print("Wollen Sie nomals Spielen? (j / n )" );
			answer = inp.input.next();
			System.out.println("\n");
			
			if (answer.equals("n")) {
				System.out.println("Danke für Spielen und bis bald");
				break;
			}
		
		}
		
	}

}
