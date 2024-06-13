package inheritance;

public class Complete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person();
		p.setAge(23);
		p.setName("Rahul");
		System.out.println(p);
		p.display1();
		
		
		Employee e=new Employee();
		e.setAge(24);
		e.setDepartment("it");
		e.setEmployeeId("F066");
		e.setName("RISHI");
		System.out.println(e);
		
		
		Employee e1=new Employee("F007", 25,"Shaswat", "IT");
		System.out.println(e1);
		e.display2();
		
		
		
		
		
		Manager m=new Manager();
		m.setAge(34);
		m.setDepartment("IT");
		m.setEmployeeId("AF002");
		m.setName("Anjana");
		m.setTeamSize("5a");
		System.out.println(m);
		m.display();
		

	}

}
