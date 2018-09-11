
public class Settings {
	
	public Settings() {
		setFarben();
	}

	private String[] colors = new String[] {"r","b","g","y","w","s"};
	
	public String[] getColors() {
		return colors;
	}
	
	private String farben = "";
		
	public String getFarben() {
		return farben;
	}
	
	public void setFarben() {
		for (String s : colors) {
			farben += s + ", ";
		}
	}
	
	private int anzahlVersuche = 11;
	
	public int getAnzahlVersuche() {
		return anzahlVersuche;
	}
	
	private int codeLenth = 4;
	
	public int getCodeLenth() {
		return codeLenth;
	}
		
}
