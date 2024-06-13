package IsARelationship;

public class GrandFather {
	
	private String Skin;
	private String Hair;
	
	public void mainfunction() {
		System.out.println("Grandfathers property");
	}
	
	public GrandFather() {
		
	}

	public GrandFather(String skin, String hair) {
		super();
		Skin = skin;
		Hair = hair;
	}

	public String getSkin() {
		return Skin;
	}

	public void setSkin(String skin) {
		Skin = skin;
	}

	public String getHair() {
		return Hair;
	}

	public void setHair(String hair) {
		Hair = hair;
	}

	@Override
	public String toString() {
		return "GrandFather [Skin=" + Skin + ", Hair=" + Hair + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}
