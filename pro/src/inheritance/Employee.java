package inheritance;

public class Employee extends Person{
	private String EmployeeId;
	private String Department;
	
	
	public void display2(){
		System.out.println("employee specific information");
	}
	
	public Employee() {
		
	}

	public Employee(String name, int age, String employeeId, String department) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeId, String department) {
		super();
		EmployeeId = employeeId;
		Department = department;
	}

	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", Department=" + Department + ", getEmployeeId()="
				+ getEmployeeId() + ", getDepartment()=" + getDepartment() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

	
}
