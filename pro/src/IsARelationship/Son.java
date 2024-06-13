package IsARelationship;

public class Son extends Father{
	
	private String age;
	private String Height;
	
	
	
	public void Son() {
		System.out.println("son method");
	
	}
	
	public Son() {
		
	}

	public Son(String skin, String hair, String type, String age) {
		super(skin, hair, type, age);
		// TODO Auto-generated constructor stub
	}

	public Son(String type, String age) {
		super(type, age);
		// TODO Auto-generated constructor stub
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getHeight() {
		return Height;
	}

	public void setHeight(String height) {
		Height = height;
	}

	@Override
	public String toString() {
		return "Son [age=" + age + ", Height=" + Height + ", getAge()=" + getAge() + ", getHeight()=" + getHeight()
				+ ", getType()=" + getType() + ", toString()=" + super.toString() + ", getSkin()=" + getSkin()
				+ ", getHair()=" + getHair() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
	

	
