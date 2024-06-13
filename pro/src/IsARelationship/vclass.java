package IsARelationship;

public class vclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v =new Vehicle();
		v.setModel("scarpoi");
		v.setSpeed(45);
		v.setType("nucleous");
		
		System.out.println(v);
		
		Car c=new Car();
		c.setColor("red");
		c.setNumberOfDoors(5);
		c.setWheels(4);
		c.setModel("yamaha");
		c.setSpeed(56);
		c.setType("fasting");
		
		System.out.println(c);
		c.display();
		c.makefunction();
		
		Car c2 =new Car("blue", 4, 67 );
		
		Car c3 =new Car("lamvergini", 56,"brown","Fasting", 4, 5);
				

	}

}
