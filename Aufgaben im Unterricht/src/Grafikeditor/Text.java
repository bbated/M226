package Grafikeditor;

public class Text extends Figur {
	
	private String text;
	
	public Text(String Text) {
		
		this.text = Text;
		
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
