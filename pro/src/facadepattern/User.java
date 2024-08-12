package facadepattern;

public class User {

	public static void main(String[] args) {
		RoomLight rt=new RoomLight();
		Telivision tt=new Telivision();
		SoundSystem ss=new SoundSystem();
		
		
		HomeTheatreFecade fecade =new HomeTheatreFecade(rt,ss,tt);
		fecade.watchMovie();
		fecade.stopWatching();

	}

}
