package facadepattern;

public class HomeTheatreFecade {
	RoomLight  roomlight;
	SoundSystem soundsystem;
	Telivision  telivision;
	
	
	public HomeTheatreFecade(RoomLight roomlight, SoundSystem soundsystem, Telivision telivision) {
		super();
		this.roomlight = roomlight;
		this.soundsystem = soundsystem;
		this.telivision = telivision;
	}
	
	public void watchMovie() {
		roomlight.lightDim();
		telivision.switchOffTv();
		soundsystem.switchOnSoundSystem();
		
	}
	
	public void stopWatching() {
		roomlight.lightDim();
		telivision.switchOffTv();
		soundsystem.switchOffSoundSystem();
	}
	
	

}
