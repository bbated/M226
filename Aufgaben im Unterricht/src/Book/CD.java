package Book;

public class CD extends Medium {
	Sound sample;

	@Override
	public void showSample(Medium m) {
		// TODO Auto-generated method stub
			Player p = new Player();
			p.playSound(((CD) m).sample);

		}
	}
