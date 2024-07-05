package lms;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		e.setEmployeeId("e001");
		e.setName("Shreya");
		e.setSalary(25000);
		System.out.println(e);
		
		Staff s=new Staff();
		s.setEmployeeId("e002");
		s.setName("rashi");
		s.setSalary(27000);
		s.setJobTitle("manager");
		System.out.println(s);
		
		
		Faculty f=new Faculty();
		f.setEmployeeId("e003");
		f.setName("rajni");
		f.setSalary(3000);
		f.setDepartment("bca");
		System.out.println(f);

	}

}
