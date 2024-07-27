package HomeWork;

public class Department {

	private int depid;
	private String depname;
	
	
	//default constructor
	public Department() {
		
	}
	
	//parametreize constructor
	public Department(int depid, String depname) {
		super();
		this.depid = depid;
		this.depname = depname;
	}

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
