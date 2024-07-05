package lms;

public class Faculty extends Employee{
	private String department;
	
	//default constructor
	public Faculty() {
		
	}
	//parametrize constructor
	public Faculty(int employeeId, String name, double salary) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(String department) {
		super();
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Faculty [department=" + department + ", getDepartment()=" + getDepartment() + ", getEmployeeId()="
				+ getEmployeeId() + ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

	
	
	
	
	

}
