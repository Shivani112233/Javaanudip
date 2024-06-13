package IsARelationship;

public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Appliance a=new Appliance();
		a.setBrandname("samsung");
		a.setPrice(43777.00);
		System.out.println(a);
		
		
		WashingMachine wm=new WashingMachine();
		wm.setBrandname("lg");
		wm.setPrice(45000);
		wm.setSize(48);
		wm.setType("settrtr");
		
		
		System.out.println(wm);
		wm.work();
		wm.mainfunction();
		
		WashingMachine wm2=new WashingMachine(78,"washer");
		System.out.println(wm2);
		
		WashingMachine wm3=new WashingMachine();
		System.out.println(wm3);
		
		
		
		
		
		

	}

}
