package july4;

public class Car extends Vehicle{

	public Car() {
		super();
		System.out.println("car constructor");
	}

	public Car(int speed) {
		super(speed);
		System.out.println("car speed is " +speed);
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("car is running");
	}

}
