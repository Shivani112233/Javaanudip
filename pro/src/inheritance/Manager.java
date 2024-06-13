package inheritance;

public class Manager extends Employee {
	private String teamSize;

	
	public void display()
	{
		System.out.println("manager specific information");
	}
	
	public Manager (){
		
	}

	public Manager(String teamSize) {
		super();
		this.teamSize = teamSize;
	}

	public Manager(String name, int age, String employeeId, String department) {
		super(name, age, employeeId, department);
		// TODO Auto-generated constructor stub
	}

	public Manager(String employeeId, String department) {
		super(employeeId, department);
		// TODO Auto-generated constructor stub
	}

	public String getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getTeamSize()=" + getTeamSize() + ", getEmployeeId()="
				+ getEmployeeId() + ", getDepartment()=" + getDepartment() + ", toString()=" + super.toString()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
