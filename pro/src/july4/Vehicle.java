package july4;

public abstract class Vehicle {

	//Abstract method
		public abstract void drive();
		
		//concrete method
		public void color() {
			System.out.println("red");
		}

		public Vehicle() {
			this(100);
			System.out.println("constructoris used");
			
		}

		public Vehicle(int speed) {
			
			System.out.println("speed is calculated");
		}
		
}
