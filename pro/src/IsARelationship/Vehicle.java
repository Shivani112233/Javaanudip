package IsARelationship;

public class Vehicle {
	
	
	private String type;
	private int speed;
	private String model;
	
	
	
	public void makefunction() {
		System.out.println("RUNNING FAST");

	}
	
	
	public Vehicle() {
		
	}


	public Vehicle(String type, int speed, String model) {
		super();
		this.type = type;
		this.speed = speed;
		this.model = model;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", speed=" + speed + ", model=" + model + "]";
	}
	
	

}
