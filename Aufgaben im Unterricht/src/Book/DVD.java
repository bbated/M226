package Book;

public class DVD extends Medium {
	Video sample;

	@Override
	public void showSample(Medium m) {
		// TODO Auto-generated method stub

			Player p = new Player();
			p.playVideo(((DVD) m).sample);
		
	}
}
