package lms;

public class Staff extends Employee{

	private String jobTitle;
	
	//default constructor
	public Staff() {
		
	}

    //parametrize constructor
	public Staff(int employeeId, String name, double salary) {
		super(employeeId, name, salary);
		// TODO Auto-generated constructor stub
	}


	public Staff(String jobTitle) {
		super();
		this.jobTitle = jobTitle;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	@Override
	public String toString() {
		return "Staff [jobTitle=" + jobTitle + ", getJobTitle()=" + getJobTitle() + ", getEmployeeId()="
				+ getEmployeeId() + ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
