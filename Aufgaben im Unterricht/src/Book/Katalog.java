package Book;

public class Katalog {
	
	private Medium[] katalog = new Medium[10];
	private int i = 0; 
	
	public void addMedium(Medium m) {
		if(m != null) {
			katalog[i] = m;
			i++;
		}
	}
	
	public void showMedium() {
		for(Medium m : katalog){
			m.showSample(m);
		}
	}
}
