package HomeWork;

public class Proffessor {

	private int id;
	private String name;
	private String Department;
	
	//default constructor
	public Proffessor() {
		
	}
	
	//parametrize constructor
	public Proffessor(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Proffessor [id=" + id + ", name=" + name + ", Department=" + Department + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

