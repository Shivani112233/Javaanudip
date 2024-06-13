package IsARelationship;

public class Car extends Vehicle {
	
	
	private String color;
	private int wheels;
	private int numberOfDoors;
	
	
	
	public void display() {
		System.out.println("car is working well");
	}
	
	public Car() {
		
	}

	public Car(String color, int wheels, int numberOfDoors) {
		super();
		this.color = color;
		this.wheels = wheels;
		this.numberOfDoors = numberOfDoors;
	}

	public Car(String type, int speed, String model,String color, int wheels, int numberOfDoors) {
		super(type, speed, model);
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", wheels=" + wheels + ", numberOfDoors=" + numberOfDoors + ", getColor()="
				+ getColor() + ", getWheels()=" + getWheels() + ", getNumberOfDoors()=" + getNumberOfDoors()
				+ ", getType()=" + getType() + ", getSpeed()=" + getSpeed() + ", getModel()=" + getModel()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
