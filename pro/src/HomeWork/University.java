package HomeWork;

public class University {

	
	private Department department;
	private Proffessor pf;
	
	
	public University() {
		
	}


	public University(Department department, Proffessor pf) {
		super();
		this.department = department;
		this.pf = pf;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Proffessor getPf() {
		return pf;
	}


	public void setPf(Proffessor pf) {
		this.pf = pf;
	}


	@Override
	public String toString() {
		return "University [department=" + department + ", pf=" + pf + "]";
	}
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
