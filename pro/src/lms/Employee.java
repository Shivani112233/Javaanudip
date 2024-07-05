package lms;

public class Employee {
	private String employeeId;
    private String name;
    private double salary;
    
    //using default constructor
    public Employee() {
    	
    }
    
    //parametrize constructor
	public Employee(String employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	//getter and setter method
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String string) {
		this.employeeId = string;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", getEmployeeId()="
				+ getEmployeeId() + ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
    
	
	
    
}
